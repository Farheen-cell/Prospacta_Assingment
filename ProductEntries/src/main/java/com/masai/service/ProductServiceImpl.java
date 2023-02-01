package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.exception.CustomerException;
import com.masai.exception.ProductException;
import com.masai.model.Customer;
import com.masai.model.Product;
import com.masai.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository ProductRepository;

	@Override
	public Product registerProduct(Product product) {
		return ProductRepository.save(product);
	}

	@Override
	public List<Product> getProductDetailsByCategory(String category) throws ProductException {
List<Product> Product= ProductRepository.findByCategory(category);
		
		if(Product.isEmpty())
			throw new ProductException("No Product find");
		
		return Product;
	}

	@Override
	public List<Product> getAllProductDetails() throws ProductException {
List<Product> product= ProductRepository.findAll();
		
		if(product.isEmpty())
			throw new CustomerException("No Customer find");
		
		return product;
	}

}
