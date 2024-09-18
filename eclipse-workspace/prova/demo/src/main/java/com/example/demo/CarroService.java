package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
	@Autowired
	CarroRepository carroRepositorio;
	  
	public List<Carro>  findAll(){
		return carroRepositorio.findAll();
	    }
	
	public Carro criar(Carro c) {
			return carroRepositorio.save(c);
	}
	public void deletar(Long id) {
		carroRepositorio.deleteById(id);
	}
	public Carro update(Long id,Carro up) {
		
		Carro car = carroRepositorio.findById(id).get();
		car.setMarca(up.getMarca());
		car.setModelo(up.getModelo());

		return carroRepositorio.save(car);
	}

	public void update(Long id, String marca, String modelo) {
		// TODO Auto-generated method stub
		
	}
}
