package com.example.demo1.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pago")
public class Pago {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "estu_seq")
	@SequenceGenerator(name = "estu_seq", sequenceName = "estu_seq", allocationSize = 1)
	
	@Column(name="pag_id")
	private Integer id;
	
	@Column(name="pag_tangeta")
	private String targeta;
	
	@Column(name="pag_valor")
	private BigDecimal valor;
	
	@OneToOne
	@JoinColumn(name ="pag_id_renta") 
	private Renta renta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTargeta() {
		return targeta;
	}

	public void setTargeta(String targeta) {
		this.targeta = targeta;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	
	
	public Renta getRenta() {
		return renta;
	}

	public void setRenta(Renta renta) {
		this.renta = renta;
	}

	@Override
	public String toString() {
		return "Pago [id=" + id + ", targeta=" + targeta + ", valor=" + valor + "]";
	}
	

	
	
	

}
