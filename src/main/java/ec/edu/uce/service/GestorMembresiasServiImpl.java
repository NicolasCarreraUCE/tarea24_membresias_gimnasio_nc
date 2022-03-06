package ec.edu.uce.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.modelo.Factura;
import ec.edu.uce.modelo.Membresia;
import ec.edu.uce.modelo.Registro;

@Service
public class GestorMembresiasServiImpl implements IGestorMembresiasServi {

	@Autowired
	private IClienteServi clienteServi;
	
	@Autowired
	private IMembresiaServi membresiaServi;
	
	@Autowired
	private IRegistroServi registroServi;
	
	@Autowired
	private IFacturaServi facturaServi;
	
	@Override
	@Transactional
	public void ingresarCliente(String cedula,String nombre, String apellido, LocalDateTime fechaNacimiento, Character estado) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setCedula(cedula);
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setFechaNacimiento(fechaNacimiento);
		cliente.setEstado(estado);
		
		this.clienteServi.insertarCliente(cliente);
	}

	@Override
	@Transactional
	public void pagarMembresia(String cedulaCliente, String codigoMembresia) {
		// TODO Auto-generated method stub
		Cliente cliente = this.clienteServi.buscarClientePorCedula(cedulaCliente);
		Membresia membresia = this.membresiaServi.buscarMembresiaPorCodigo(codigoMembresia);
		
		Registro registro = new Registro();
		registro.setFechaPago(LocalDateTime.now());
		registro.setValorPago(membresia.getValor());
		registro.setCliente(cliente);
		registro.setMembresia(membresia);
		
		this.registroServi.insertarRegistro(registro);
		
		cliente.setEstado('P');
		
		this.clienteServi.actualizarCliente(cliente);
		
		membresia.setCantidad(membresia.getCantidad() + 1);
		
		this.membresiaServi.actualizarMembresia(membresia);
		
		this.generarFacturaSRI(cliente, registro);
	}
	
	@Transactional(value = TxType.REQUIRES_NEW)
	private void generarFacturaSRI(Cliente cliente, Registro registro) {
		Factura factura = new Factura();
		factura.setCedulaCliente(cliente.getCedula());
		factura.setFechaPago(registro.getFechaPago());
		factura.setValorPago(registro.getValorPago());
		 this.facturaServi.insertarFactura(factura);
	}

}
