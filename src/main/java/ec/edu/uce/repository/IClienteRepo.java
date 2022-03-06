package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cliente;

public interface IClienteRepo {
	void insertarCliente(Cliente cliente);
	Cliente obtenerCliente(Integer id);
	void actualizarCliente(Cliente cliente);
	void borrarCliente(Integer id);
	
	Cliente buscarClientePorCedula(String cedula);
}
