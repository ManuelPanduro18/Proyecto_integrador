package com.manuel.tecsup.productosapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuel.tecsup.productosapi.models.Tema;
import com.manuel.tecsup.productosapi.repositories.TemaRepository;

@Service
public class TemaService {
	
	@Autowired
	private TemaRepository temaRepository;
	
	public List<Tema>lsitar(){
		return temaRepository.listar();
		
	}
	

}
