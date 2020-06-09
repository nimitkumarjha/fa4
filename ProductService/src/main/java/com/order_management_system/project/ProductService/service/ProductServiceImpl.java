package com.order_management_system.project.ProductService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.order_management_system.project.ProductService.DAO.ProductDAO;
import com.order_management_system.project.ProductService.model.Product;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	@Override
	public List<Product> getALLProducts(int prodid){
		List<Product> products = null;
		products = productDAO.getAllProducts(prodid);
		return products;
		
	}
	@Override
	public List<Product> getALLProductsOnCategoryBasis(String category) {
		List<Product> pro = null;
		pro = productDAO.getALLProductsOnCategoryBasis(category);
		return pro;
	}
	
	@Override
	public Product addproduct(Product p) {
		return productDAO.addproduct(p);
	}
}
