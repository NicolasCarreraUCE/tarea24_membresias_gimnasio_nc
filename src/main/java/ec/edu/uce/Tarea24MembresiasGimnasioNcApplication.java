package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import ec.edu.uce.modelo.Membresia;
import ec.edu.uce.service.IGestorMembresiasServi;
import ec.edu.uce.service.IMembresiaServi;

@SpringBootApplication
public class Tarea24MembresiasGimnasioNcApplication implements CommandLineRunner {
	
	@Autowired
	private IMembresiaServi membresiaServi;
	
	@Autowired
	private IGestorMembresiasServi gestorMembresiasServi;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea24MembresiasGimnasioNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// INSERTAR MEMBRESIA
//		Membresia membresia = new Membresia();
//		membresia.setCodigo("123");
//		membresia.setNombre("Plan económica");
//		membresia.setValor(new BigDecimal("15.00"));
//		membresia.setVigencia(true);
//		membresia.setCantidad(20);
//		
//		this.membresiaServi.insertarMembresia(membresia);
		
		// INSERTAR CLIENTES
//		this.gestorMembresiasServi.ingresarCliente("1708666976", "Gisela", "Quevedo", LocalDateTime.of(1989,  Month.AUGUST, 8, 12, 45), 'N');
//		this.gestorMembresiasServi.ingresarCliente("1745211671", "Maria", "Cruz", LocalDateTime.of(1995,  Month.FEBRUARY, 8, 12, 45), 'N');
		
		// REALIZAR PAGO
		this.gestorMembresiasServi.pagarMembresia("1708666976", "123");
	}

}
