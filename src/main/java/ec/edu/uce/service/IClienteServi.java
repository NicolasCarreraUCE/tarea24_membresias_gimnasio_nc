package ec.edu.uce.service;

import ec.edu.uce.modelo.Cliente;

public interface IClienteServi {
	void insertarCliente(Cliente cliente);
	Cliente obtenerCliente(Integer id);
	void actualizarCliente(Cliente cliente);
	void borrarCliente(Integer id);
	
	Cliente buscarClientePorCedula(String cedula);
}
