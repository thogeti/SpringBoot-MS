package com.example.crud.retailapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.retailapp.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
