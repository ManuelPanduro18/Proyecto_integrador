package com.manuel.tecsup.productosapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuel.tecsup.productosapi.models.Politica;
import com.manuel.tecsup.productosapi.repositories.PoliticaRepository;

@Service
public class PoliticaService {
	@Autowired
	private PoliticaRepository politicaRepository;
	
	public List<Politica>listar(){
		return politicaRepository.listar();
	}
	

}
