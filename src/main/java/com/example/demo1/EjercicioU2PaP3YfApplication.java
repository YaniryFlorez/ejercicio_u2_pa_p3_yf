package com.example.demo1;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo1.modelo.Automovil;
import com.example.demo1.modelo.Cliente;
import com.example.demo1.service.IAutoServi;
import com.example.demo1.service.IClienteServi;
import com.example.demo1.service.IPagoServi;
import com.example.demo1.service.IRentaServi;

@SpringBootApplication
public class EjercicioU2PaP3YfApplication implements CommandLineRunner {
	
	@Autowired
	private IAutoServi autoServi;
	
	@Autowired
	private IClienteServi clienteServi;
	
	@Autowired
	private IRentaServi rentaServi;
	
	@Autowired
	private IPagoServi pagoServi;
	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3YfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Automovil auto= new Automovil();
		auto.setPlaca("123A");
		auto.setValor(new BigDecimal(12000));
		this.autoServi.crear(auto);
		
		Cliente clie = new Cliente();
		clie.setCedula("179533456");
		clie.setNombre("Carlos");
		this.clienteServi.crear(clie);
		
		
	
		
		
		
	}

	
}
