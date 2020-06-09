package com.order_management_system.project.ProductService.service;

import java.util.List;

import com.order_management_system.project.ProductService.model.Product;


public interface ProductService {
	
	public List<Product> getALLProducts(int prodid);

	public List<Product> getALLProductsOnCategoryBasis(String category);

	public Product addproduct(Product p);
	
	
	
	
}
