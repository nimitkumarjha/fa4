package com.order_management_system.project.ProductService.model;


public class Product{

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", category=" + category + ", description=" + description + ", image="
				+ image + ", price=" + price + ", prodid=" + prodid + ", productname=" + productname + ", rating="
				+ rating + ", sellerid=" + sellerid + ", stock=" + stock + ", subcategory=" + subcategory + "]";
	}
	private String brand;
	private String category;
	private String description;
	private String image;
	private Double price;
	private int prodid;
	private String productname;
	private String rating;
	private int sellerid;
	private int stock;
	private String subcategory;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getSellerid() {
		return sellerid;
	}
	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public Product(String brand, String category, String description, String image, Double price, int prodid,
			String productname, String rating, int sellerid, int stock, String subcategory) {
		super();
		this.brand = brand;
		this.category = category;
		this.description = description;
		this.image = image;
		this.price = price;
		this.prodid = prodid;
		this.productname = productname;
		this.rating = rating;
		this.sellerid = sellerid;
		this.stock = stock;
		this.subcategory = subcategory;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public  Product createEntity() {
		// TODO Auto-generated method stub
		Product produ = new Product();
		produ.setBrand(this.getBrand());
		produ.setCategory(this.getCategory());
		produ.setDescription(this.getDescription());
		produ.setImage(this.getImage());
		produ.setPrice(this.getPrice());
		produ.setProdid(this.getProdid());
		produ.setProductname(this.getProductname());
		produ.setSellerid(this.getSellerid());
		produ.setStock(this.getStock());
		produ.setSubcategory(this.getSubcategory());
		return produ;
	}
	
//	// Converts Entity into DTO
//		public static Product valueOf(producte productDetails) {
//			Product produ = new Product();
//			produ.setBrand(productDetails.getBrand());
//			produ.setCategory(productDetails.getCategory());
//			produ.setDescription(productDetails.getDescription());
//			produ.setImage(productDetails.getImage());
//			produ.setPrice(productDetails.getPrice());
//			produ.setProdid(productDetails.getProdid());
//			produ.setProductname(productDetails.getProductname());
//			produ.setRating(productDetails.getRating());
//			produ.setSellerid(productDetails.getSellerid());
//			produ.setStock(productDetails.getStock());
//			produ.setSubcategory(productDetails.getSubcategory());
//			return produ;
//	
//	
//		}
	
}
