package com.example.demo1.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "estu_seq")
	@SequenceGenerator(name = "estu_seq", sequenceName = "estu_seq", allocationSize = 1)
	
	@Column(name="rent_id")
	private Integer id;
	
	@Column(name="rent_fecha")
	private LocalDateTime fecha;
	
	@Column(name="rent_numero_dias")
	private Integer dias;
	
	@Column(name="rent_valor")
	private BigDecimal valor;
	
	@OneToOne(mappedBy = "renta", cascade = CascadeType.ALL) 
	private Pago pago;
	
	@ManyToOne
	@JoinColumn(name = "rent_id_auto") 
	private Automovil automovil;
	
	@ManyToOne
	@JoinColumn(name = "rent_cedula_cliente") 
	private Cliente cliente;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}
	
	

	public Automovil getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Renta [id=" + id + ", fecha=" + fecha + ", dias=" + dias + ", valor=" + valor + "]";
	}
	
	
}
