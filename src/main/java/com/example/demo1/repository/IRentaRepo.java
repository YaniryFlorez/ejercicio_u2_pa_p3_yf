package com.example.demo1.repository;


import com.example.demo1.modelo.Renta;

public interface IRentaRepo {
	public void insertar(Renta renta);
	public void actualizar(Renta renta); 
	public Renta buscar(Integer id);
	public void eliminar(Integer id);
}
