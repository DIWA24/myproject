package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.Product;

@ComponentScan("com")
@Repository
public interface ProductDao {
	
	public void addProduct(Product product);
}
