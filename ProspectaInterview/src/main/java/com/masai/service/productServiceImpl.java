package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masai.config.RestTemplateConfig;
import com.masai.model.product;

@Service
public class productServiceImpl implements productService{
	
	@Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL = "https://fakestoreapi.com/products/category/";

    @Override
    public product[] fetchProductsByCategory(String category) throws Exception {
        try {
            String url = BASE_URL + category;
            product[] products = restTemplate.getForObject(url, product[].class);

            

            return products;
        } catch (Exception e) {
            throw new Exception("Error fetching products for category: " + category, e);
        }
    }
    
    @Override
    public product addProduct(product product) throws Exception{
        try {
            product createdProduct = restTemplate.postForObject(BASE_URL, product, product.class);

           

            return createdProduct;
        } catch (Exception e) {
            throw new Exception("Error occurred while adding the product: " + e.getMessage(), e);
        }
    }
}
