package com.nelioalves.cursomc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.model.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

@RestController	
@RequestMapping(value="/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
	  
	  Categoria obj = service.buscar(id);
	  
	  return ResponseEntity.ok().body(obj);
	}
}
