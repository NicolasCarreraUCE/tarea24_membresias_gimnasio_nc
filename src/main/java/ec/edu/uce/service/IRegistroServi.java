package ec.edu.uce.service;

import ec.edu.uce.modelo.Registro;

public interface IRegistroServi {
	void insertarRegistro(Registro registro);
	Registro obtenerRegistro(Integer id);
	void actualizarRegistro(Registro registro);
	void borrarRegistro(Integer id);
}
