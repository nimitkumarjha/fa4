package com.order_management_system.project.ProductService.DAO;

import java.util.List;

import com.order_management_system.project.ProductService.model.Product;


public interface ProductDAO {
	public List<Product> getAllProducts(int prodid);

	public List<Product> getALLProductsOnCategoryBasis(String category);

	
	public Product addproduct(Product p);
}
