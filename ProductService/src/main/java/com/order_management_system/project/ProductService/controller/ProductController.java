package com.order_management_system.project.ProductService.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.internal.CriteriaImpl.Subcriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
//import org.springframework.web.client.RestTemplate;

import com.order_management_system.project.ProductService.model.Product;
import com.order_management_system.project.ProductService.service.ProductService;

@RestController
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/product/{prodid}")
	public Product addProductToWhislist(int prodid) {
	
		return null;

	}
	
//	@PutMapping(value = "/updateStock/{sellerid}")
//	public Product updateStock(@RequestBody int sellerid) {
//		Product p =new Product();
//		sellerDTO response1 = new RestTemplate().getForObject("http://localhost:8080/", seller.class);
//		/* here we need check how many quantity ordered
//		 * for that we are using one more time resttemplate*/
//		productorderedDTO response2 = new RestTemplate().getForObject("http://localhost:8080/", productordered.class);
//		order response3 = new RestTemplate().getForObject("http://localhost:8080/", order.class);
//		
//		if (response.getSellerid()==sellerid) {
//			
//		int updatedStock=	p.getStock() - response2.getquantity();
//		
//		// response2.getquantity();
//			p.setStock(updatedStock);
//		}
//		return p;
//	}
	
	
	@PostMapping(value="/addproduct")
	public Product newproduct(@RequestBody Product  prod) {
		return productService.addproduct(prod);
		
	}
	
	@GetMapping(value = "/{prodid}")
	public List<Product> getAllProducts(@PathVariable int prodid) {
		
		List<Product> products = null;
		products = productService.getALLProducts(prodid);
			
		return products;
		
		
	}
	@GetMapping(value="/catergory/{category}")
	public List<Product> getALLProducts(@PathVariable String category){
		
	List<Product> pro = null;
	pro = productService.getALLProductsOnCategoryBasis(category);
	
	return pro;
	}
}
