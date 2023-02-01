package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;
import com.masai.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/entry")
	public ResponseEntity<Product> saveProductHandler(@RequestBody Product product){

		
		
		
		Product registeredProduct= productService.registerProduct(product);
		
		return new ResponseEntity<>(registeredProduct,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/entries/{category}")
	public ResponseEntity<List<Product>> getProductByCategoryHandler(@PathVariable("category") String category){
		
		
		List<Product> product= productService.getProductDetailsByCategory(category);
		
		return new ResponseEntity<List<Product>>(product,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/entries")
	public ResponseEntity<List<Product>> getAllProductHandler(){
		
		
		List<Product> product= productService.getAllProductDetails();
		
		return new ResponseEntity<>(product,HttpStatus.ACCEPTED);
		
	}

}
