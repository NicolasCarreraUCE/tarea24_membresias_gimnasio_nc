package ec.edu.uce.repository;

import ec.edu.uce.modelo.Registro;

public interface IRegistroRepo {
	void insertarRegistro(Registro registro);
	Registro obtenerRegistro(Integer id);
	void actualizarRegistro(Registro registro);
	void borrarRegistro(Integer id);
}
