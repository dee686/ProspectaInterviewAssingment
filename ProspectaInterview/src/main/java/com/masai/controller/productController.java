package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.product;
import com.masai.service.productServiceImpl;

@RestController
@RequestMapping("/api/products")
public class productController {
	
	 @Autowired
	    private com.masai.service.productService productService;

	    @GetMapping("/{category}")
	    public ResponseEntity<?> getProductsByCategory(@PathVariable String category) {
	        try {
	            product[] products = productService.fetchProductsByCategory(category);
	            return ResponseEntity.ok(products);
	        } 
	        catch (Exception e) {
	            return ResponseEntity.status(500).body("An unexpected error occurred: " + e.getMessage());
	        }
	    }
	    
	    @PostMapping
	    public ResponseEntity<?> addProduct(@RequestBody product product) {
	        try {
	            product createdProduct = productService.addProduct(product);
	            return ResponseEntity.ok(createdProduct);
	        } 
	        catch (Exception e) {
	            return ResponseEntity.status(500).body("An unexpected error occurred: " + e.getMessage());
	        }
	    }

}
