package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro {

	@Id
	@Column(name = "regi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_registro")
	@SequenceGenerator(name = "seq_registro", sequenceName = "seq_registro", allocationSize = 1)
	private Integer id;
	
	@Column(name = "regi_fecha_pago")
	private LocalDateTime fechaPago;
	
	@Column(name = "regi_valor")
	private BigDecimal valorPago;
	
	@OneToOne
	@JoinColumn(name = "clie_id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "memb_id")
	private Membresia membresia;

	// SET-GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDateTime fechaPago) {
		this.fechaPago = fechaPago;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Membresia getMembresia() {
		return membresia;
	}

	public void setMembresia(Membresia membresia) {
		this.membresia = membresia;
	}
	
}
