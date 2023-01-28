package com.example.demo1.repository;

import com.example.demo1.modelo.Automovil;

public interface IAutoRepo {
	public void insertar(Automovil automovil);
	public void actualizar(Automovil automovil); 
	public Automovil buscar(String placa);
	public void eliminar(String placa);
}
