package com.example.demo1.repository;


import com.example.demo1.modelo.Pago;

public interface IPagoRepo {
	public void insertar(Pago pago);
	public void actualizar(Pago pago); 
	public Pago buscar(Integer id);
	public void eliminar(Integer id);
}
