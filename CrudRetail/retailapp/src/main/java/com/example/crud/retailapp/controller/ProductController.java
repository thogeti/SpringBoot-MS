package com.example.crud.retailapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.retailapp.entity.Products;
import com.example.crud.retailapp.service.ProductService;

@RestController
@RequestMapping("/crudretail")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	
	  @GetMapping("/findAll") 
	  public ResponseEntity<List<Products>> findAll()
	  {
	  //return productService.findAllProduct();
		  return ResponseEntity.ok().body(productService.findAllProduct()); 
		  //return "SpringBoot Welcome";
	  }
	  
	  @GetMapping("/findProductById/{id}")
		public ResponseEntity<Products> findProductById(@PathVariable long id) {
			return ResponseEntity.ok().body( productService.findProductById(id));
		//return productService.findProductById(id);
		}
		
		@PostMapping("/create")
		public ResponseEntity<Products> createProduct(@RequestBody Products product) {
			return ResponseEntity.ok().body( productService.createProduct(product));
		}
		
		@PutMapping("/update")
		public ResponseEntity<Products> updateProduct(@RequestBody Products product) {
			return ResponseEntity.ok().body( productService.updateProduct(product));
		}
		
		@DeleteMapping("/delete/{id}")
		public HttpStatus deleteProduct(@PathVariable long id) {
			 productService.deleteProductById(id);
			 return HttpStatus.OK;
		}
	 

}