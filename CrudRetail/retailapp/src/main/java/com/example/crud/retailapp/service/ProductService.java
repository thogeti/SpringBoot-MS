package com.example.crud.retailapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.retailapp.entity.Products;
import com.example.crud.retailapp.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Products createProduct(Products products) {
		return productRepository.save(products);
	}
	
	public Products updateProduct(Products products) {
		//return updateProd.save(products);
		Optional<Products> optionalProduct = productRepository.findById(products.getId());
		
		if(optionalProduct.isPresent()) {
			Products updateProd = optionalProduct.get();
			updateProd.setName(products.getName());
			updateProd.setDescription(products.getDescription());
			updateProd.setPrice(products.getPrice());
			productRepository.save(updateProd);
			
			return updateProd;
		}
		throw new RuntimeException("Update Product not happen");
	}
	
	public Products findProductById(Long id) {
		//return updateProd.save(products);
		Optional<Products> optionalProduct = productRepository.findById(id);
		
		if(optionalProduct.isPresent()) {
			
			
			return optionalProduct.get();
		}
		throw new RuntimeException(" findProductById Product not available");
	}
	
	
	  public List<Products> findAllProduct() 
	  { return productRepository.findAll();
	  
	  }
	 
	
	public void deleteProductById(Long id) {
		//return updateProd.save(products);
		Optional<Products> optionalProduct = productRepository.findById(id);
		
		if(optionalProduct.isPresent()) {
			
			
			productRepository.deleteById(id);
		}
		throw new RuntimeException(" Product not available Delete");
	}

}
