package com.example.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.retail.entity.Products;

public interface ProductRepository extends CrudRepository<Products, Long>{

}
