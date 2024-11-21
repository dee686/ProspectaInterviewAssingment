package com.masai.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.product;

@Repository
public interface ProductRepository extends JpaRepository<product, Integer> {
	
	

}
