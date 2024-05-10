package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RetailController {
	
	//http://localhost:8080/api/v2/getData
	@GetMapping("/getData")
	public String getData() {
		return "SpringBoot Welcome";
	}

}
