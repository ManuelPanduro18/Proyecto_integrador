package com.manuel.tecsup.productosapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuel.tecsup.productosapi.models.Historia;
import com.manuel.tecsup.productosapi.repositories.HistoriaRepository;

@Service
public class HistoriaService {
	@Autowired
	private HistoriaRepository historiaRepository;
	
	public List<Historia>listar(){
		return historiaRepository.listar();
	}

}
