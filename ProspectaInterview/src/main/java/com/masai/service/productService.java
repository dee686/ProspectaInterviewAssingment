package com.masai.service;



import com.masai.model.product;


public interface productService {
	
	public product[] fetchProductsByCategory(String category)throws Exception;
	public  product addProduct(product product)throws Exception ;
}
