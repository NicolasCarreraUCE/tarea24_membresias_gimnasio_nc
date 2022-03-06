package ec.edu.uce.repository;

import ec.edu.uce.modelo.Factura;

public interface IFacturaRepo {
	void insertarFactura(Factura factura);
	Factura obtenerFactura(Integer id);
	void actualizarFactura(Factura factura);
	void borrarFactura(Integer id);
}
