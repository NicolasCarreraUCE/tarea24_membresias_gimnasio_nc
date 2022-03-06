package ec.edu.uce.service;

import java.time.LocalDateTime;

public interface IGestorMembresiasServi {
	void ingresarCliente(String cedula, String nombre, String apellido, LocalDateTime fechaNacimiento, Character estado);
	void pagarMembresia(String cedulaCliente, String codigoMembresia);
}
