package com.example.microServicios.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class indexController {

	Logger logger = LoggerFactory.getLogger(indexController.class);
	
	String status ;
	String abierto = "abierto" ;
	String cerrado = "cerrado";
	String medioAbierto = "medio abierto";
	
	@GetMapping("/abierto")
	public ResponseEntity<String> sendToAbierto(){
		status = abierto;
		
		logger.info("estado cliente = " + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	
	@GetMapping("/cerrado")
	public ResponseEntity<String> sendToCerrado(){
		status = cerrado;
		
		logger.info("estado cliente = " + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	@GetMapping("/medioAbierto")
	public ResponseEntity<String> sendToMedioAbierto(){
		status = medioAbierto;
		
		logger.info("estado cliente = " + status);
		return ResponseEntity.status(HttpStatus.OK).body(status);
	}
	
	
	
	
	
	
}
