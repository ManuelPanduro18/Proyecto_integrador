package com.manuel.tecsup.productosapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manuel.tecsup.productosapi.models.Noticia;
import com.manuel.tecsup.productosapi.repositories.NoticiaRepository;

@Service
public class NoticiaService {
	@Autowired
	private NoticiaRepository noticiaRepository;
	
	public List<Noticia>listar(){
		return noticiaRepository.listar();
	}

}
