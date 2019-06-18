package com.manuel.tecsup.productosapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuel.tecsup.productosapi.models.Literatura;
import com.manuel.tecsup.productosapi.repositories.LiteraturaRepository;

@Service
public class LiteraturaService {
	@Autowired
	private LiteraturaRepository literaturaRepository;
	
	public List<Literatura>listar(){
		return literaturaRepository.listar();
	}
}
