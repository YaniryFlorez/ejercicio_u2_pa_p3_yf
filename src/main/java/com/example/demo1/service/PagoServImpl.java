package com.example.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.modelo.Pago;
import com.example.demo1.repository.IPagoRepo;

@Service
public class PagoServImpl implements IPagoServi{
	
	@Autowired
	private IPagoRepo pagoRepo;

	@Override
	public void crear(Pago pago) {
		// TODO Auto-generated method stub
		this.pagoRepo.insertar(pago);
	}

	@Override
	public void actualizar(Pago pago) {
		// TODO Auto-generated method stub
		this.pagoRepo.actualizar(pago);
	}

	@Override
	public Pago buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.pagoRepo.eliminar(id);
	}

}
