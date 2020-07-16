package com.natan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
