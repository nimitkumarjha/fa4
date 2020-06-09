package com.order_management_system.project.ProductService.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.order_management_system.project.ProductService.entity.ProductEntity;
import com.order_management_system.project.ProductService.model.Product;


@Repository(value = "productDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Product> getAllProducts(int prodid) {

		Query query = entityManager.createQuery("select p from ProductEntity p where p.prodid=:prodid");
		query.setParameter("prodid", prodid);
		List<ProductEntity> productEntityList= query.getResultList();
		
		List<Product> listOfProducts = new ArrayList<Product>();
		for (ProductEntity productEntity : productEntityList) {
			Product product = new Product();
			product.setBrand(productEntity.getBrand());
			product.setCategory(productEntity.getCategory());
			product.setDescription(productEntity.getDescription());
			product.setImage(productEntity.getImage());
			product.setPrice(productEntity.getPrice());
			product.setProdid(productEntity.getProdid());
//			product.setQuantity(productEntity.getQuantity());
//			product.setDiscount(productEntity.getDiscount());

			listOfProducts.add(product);
		}
		return listOfProducts;
	}

	@Override
	public List<Product> getALLProductsOnCategoryBasis(String category) {
		Query query = entityManager.createQuery("select p from ProductEntity p where p.category=:category");
		query.setParameter("category", category);
		List<ProductEntity> productEntityList= query.getResultList();
		List<Product> listOfProducts = new ArrayList<Product>();
		for (ProductEntity productEntity : productEntityList) {
			Product product = new Product();
			product.setBrand(productEntity.getBrand());
			product.setCategory(productEntity.getCategory());
			product.setDescription(productEntity.getDescription());
			product.setImage(productEntity.getImage());
			product.setPrice(productEntity.getPrice());
			product.setProdid(productEntity.getProdid());
			product.setStock(productEntity.getStock());
			product.setSubcategory(productEntity.getSubcategory());
			product.setSellerid(productEntity.getSellerid());
			product.setRating(productEntity.getRating());
			product.setProductname(productEntity.getProductname());

			listOfProducts.add(product);
		}
		return listOfProducts;
	}
	@Override
	public Product addproduct(Product p) {
		p.createEntity();
		return p;
	}
}
