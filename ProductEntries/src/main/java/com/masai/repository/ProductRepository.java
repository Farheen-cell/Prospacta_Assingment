package com.masai.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	public List<Product> findByCategory(String Category);
	}
