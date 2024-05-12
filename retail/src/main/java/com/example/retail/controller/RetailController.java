package com.example.retail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Products;
import com.example.service.ProductService;

@RestController
@RequestMapping("/api")
public class RetailController {
	@Autowired
	private ProductService productService;
	//http://localhost:8080/api/v2/getData
	@GetMapping("/getData")
	public String getData() {
		return "SpringBoot Welcome";
	}
	@PostMapping("/create")
	public ResponseEntity<Products> createProduct(@RequestBody Products product) {
		return ResponseEntity.ok().body( productService.createProduct(product));
	}
}
