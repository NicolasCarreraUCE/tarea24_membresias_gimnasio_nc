package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.repository.IClienteRepo;

@Service
public class ClienteServiImpl implements IClienteServi {

	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void insertarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertarCliente(cliente);
	}

	@Override
	public Cliente obtenerCliente(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.obtenerCliente(id);
	}

	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizarCliente(cliente);
	}

	@Override
	public void borrarCliente(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.borrarCliente(id);
	}

	@Override
	public Cliente buscarClientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarClientePorCedula(cedula);
	}

}
