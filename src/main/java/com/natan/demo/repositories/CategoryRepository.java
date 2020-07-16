package com.natan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
