package ec.edu.uce.service;

import ec.edu.uce.modelo.Factura;

public interface IFacturaServi {
	void insertarFactura(Factura factura);
	Factura obtenerFactura(Integer id);
	void actualizarFactura(Factura factura);
	void borrarFactura(Integer id);
}
