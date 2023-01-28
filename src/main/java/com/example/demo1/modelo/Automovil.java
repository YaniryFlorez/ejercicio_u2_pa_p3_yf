package com.example.demo1.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")
public class Automovil {

	@Id
	
	@Column(name="aut_placa")
	private String placa;
	
	@Column(name="aut_valor_por_dia")
	private BigDecimal valor;

	public String getPlaca() {
		return placa;
	
	}
	
	@OneToMany(mappedBy = "automovil", cascade =CascadeType.ALL, fetch = FetchType.EAGER )
	private List<Renta> renta;
	
	
	
	//set y get

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	

	public List<Renta> getRenta() {
		return renta;
	}

	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}

	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", valor=" + valor + "]";
	}
	
	
	
	
	
}
