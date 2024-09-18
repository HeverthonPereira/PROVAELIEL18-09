package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PessoaService { 
	
	@Autowired
	public PessoaRepository pessoaRepository;
	
	
	public List <Pessoa> findAll(){
		return pessoaRepository.findAll();
	}
	
	public Pessoa criar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	
	}
	public void deletar(Long id) {
		pessoaRepository.deleteById(id);
	}
}