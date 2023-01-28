package com.example.demo1.service;

import com.example.demo1.modelo.Renta;

public interface IRentaServi {
	public void crear(Renta renta);
	public void actualizar(Renta renta); 
	public Renta buscar(Integer id);
	public void borrar(Integer id);
}
