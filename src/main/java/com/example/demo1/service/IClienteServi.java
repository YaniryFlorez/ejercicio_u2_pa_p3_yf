package com.example.demo1.service;

import com.example.demo1.modelo.Cliente;

public interface IClienteServi {
	public void crear(Cliente cliente);
	public void actualizar(Cliente cliente); 
	public Cliente buscar(String cedula);
	public void borrar(String cedula);
}
