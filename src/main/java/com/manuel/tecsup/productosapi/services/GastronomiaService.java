package com.manuel.tecsup.productosapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuel.tecsup.productosapi.models.Gastronomia;
import com.manuel.tecsup.productosapi.repositories.GastronomiaRepository;

@Service
public class GastronomiaService {
	@Autowired
	private GastronomiaRepository gastronomiaRepository;
	
	public List<Gastronomia>listar(){
		return gastronomiaRepository.listar();
	}
	
	public Gastronomia obtener(Integer id) {
		return gastronomiaRepository.obtener(id);
	}
}
