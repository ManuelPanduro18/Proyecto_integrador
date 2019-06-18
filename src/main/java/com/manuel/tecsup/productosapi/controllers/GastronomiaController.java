package com.manuel.tecsup.productosapi.controllers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manuel.tecsup.productosapi.models.Gastronomia;
import com.manuel.tecsup.productosapi.services.GastronomiaService;

@RestController
public class GastronomiaController {
private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	private static final String FILEPATH = "/imagenes";
	
	@Autowired
	private GastronomiaService gastronomiaService;
	
	@GetMapping("/gastronomias")
	public List<Gastronomia>gastronomias(){
		logger.info("call gastronomias");
		
		List<Gastronomia> gastronomias=gastronomiaService.listar();
		
		return gastronomias;
	}
	
	@GetMapping("/gastronomias/imagenes/{filename:.+}")
	public ResponseEntity<Resource> files(@PathVariable String filename) throws Exception{
		logger.info("call imagenes: " + filename);
		
		Resource resource = new UrlResource(Paths.get(FILEPATH).resolve(filename).toUri());
		logger.info("Resource: " + resource);
		
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\""+resource.getFilename()+"\"")
				.header(HttpHeaders.CONTENT_TYPE, Files.probeContentType(Paths.get(FILEPATH).resolve(filename)))
				.header(HttpHeaders.CONTENT_LENGTH, String.valueOf(resource.contentLength()))
				.body(resource);
	}



}
