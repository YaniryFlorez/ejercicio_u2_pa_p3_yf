package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Renta;
import com.example.demo1.repository.IRentaRepo;

@Service
public class RentaServImpl implements IRentaServi{
	
	@Autowired
	private IRentaRepo rentaRepo;

	@Override
	public void crear(Renta renta) {
		// TODO Auto-generated method stub
		this.rentaRepo.insertar(renta);
	}

	@Override
	public void actualizar(Renta renta) {
		// TODO Auto-generated method stub
		this.rentaRepo.actualizar(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.rentaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.rentaRepo.eliminar(id);
	}

}
