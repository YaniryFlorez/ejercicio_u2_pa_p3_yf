package com.example.demo1.service;

import com.example.demo1.modelo.Automovil;

public interface IAutoServi {
	public void crear(Automovil automovil);
	public void actualizar(Automovil automovil); 
	public Automovil buscar(String placa);
	public void borrar(String placa);
}
