package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@PostMapping("/Products")
	public ResponseEntity<Product> registerProductHandler(@RequestBody Product product)throws ProductException{
		
		Product savedproduct = productservice.registerProduct(product);
		
		return new ResponseEntity<>(savedproduct, HttpStatus.CREATED);
		
		
	}
	
	
}
