/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encuestas.repository;

import com.encuestas.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BEDON MERA
 */
@RestController
public class EncuestControl {
    
    @Autowired
    private EncuestRepositorio Repository;

       @RequestMapping(value="/taller", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(){
		Iterable<Producto> producto =Repository.findAll();
		return new ResponseEntity<>(producto,HttpStatus.OK);
	}

}
