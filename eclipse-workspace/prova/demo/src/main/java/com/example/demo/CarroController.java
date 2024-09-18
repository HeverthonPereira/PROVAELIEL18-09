package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {
	
	
	@Autowired
	CarroService carroservice;
	
	
	@GetMapping("/lista")
	public List <Carro> lista(){
		return carroservice.findAll();
	}
	
	@PostMapping("/criar")
	public void criar(@RequestBody Carro carro) {
		carroservice.criar(carro);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletar(@PathVariable Long id) {
		carroservice.deletar(id);
	}
	@PutMapping("/update")
	public void update(@PathVariable Long id , String marca, String modelo) {
		carroservice.update(id,marca, modelo);
	}
	
	
}