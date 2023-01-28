package com.example.demo1.service;

import com.example.demo1.modelo.Pago;

public interface IPagoServi {
	public void crear(Pago pago);
	public void actualizar(Pago pago); 
	public Pago buscar(Integer id);
	public void borrar(Integer id);
}
