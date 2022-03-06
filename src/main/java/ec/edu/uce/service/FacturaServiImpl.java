package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Factura;
import ec.edu.uce.repository.IFacturaRepo;

@Service
public class FacturaServiImpl implements IFacturaServi {

	@Autowired
	private IFacturaRepo facturaRepo;
	
	@Override
	public void insertarFactura(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.insertarFactura(factura);
	}

	@Override
	public Factura obtenerFactura(Integer id) {
		// TODO Auto-generated method stub
		return this.facturaRepo.obtenerFactura(id);
	}

	@Override
	public void actualizarFactura(Factura factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.actualizarFactura(factura);
	}

	@Override
	public void borrarFactura(Integer id) {
		// TODO Auto-generated method stub
		this.facturaRepo.borrarFactura(id);
	}

}
