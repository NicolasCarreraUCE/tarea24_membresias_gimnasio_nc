package ec.edu.uce.service;

import ec.edu.uce.modelo.Membresia;

public interface IMembresiaServi {
	void insertarMembresia(Membresia membresia);
	Membresia obtenerMembresia(Integer id);
	void actualizarMembresia(Membresia membresia);
	void borrarMembresia(Integer id);
	
	Membresia buscarMembresiaPorCodigo(String codigo);
}
