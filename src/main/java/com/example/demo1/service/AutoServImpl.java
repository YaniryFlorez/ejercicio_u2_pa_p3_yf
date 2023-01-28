package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Automovil;
import com.example.demo1.repository.IAutoRepo;

@Service
public class AutoServImpl implements IAutoServi{
	
	@Autowired
	private IAutoRepo autoRepo;
	

	@Override
	public void crear(Automovil automovil) {
		// TODO Auto-generated method stub
		this.autoRepo.insertar(automovil);
	}

	@Override
	public void actualizar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.autoRepo.actualizar(automovil);
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return this.autoRepo.buscar(placa);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.autoRepo.eliminar(placa);
	}

}
