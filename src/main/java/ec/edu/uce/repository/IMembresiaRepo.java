package ec.edu.uce.repository;

import ec.edu.uce.modelo.Membresia;

public interface IMembresiaRepo {
	void insertarMembresia(Membresia membresia);
	Membresia obtenerMembresia(Integer id);
	void actualizarMembresia(Membresia membresia);
	void borrarMembresia(Integer id);
	
	Membresia buscarMembresiaPorCodigo(String codigo);
}
