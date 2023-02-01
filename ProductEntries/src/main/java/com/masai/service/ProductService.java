package com.masai.service;

import java.util.List;

import com.masai.exception.ProductException;

import com.masai.model.Product;

public interface ProductService {

public Product registerProduct(Product product);
	
	public List<Product> getProductDetailsByCategory(String category)throws ProductException;
	
	public List<Product> getAllProductDetails()throws ProductException;
}
