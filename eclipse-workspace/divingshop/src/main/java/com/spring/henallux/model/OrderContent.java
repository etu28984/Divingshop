package com.spring.henallux.model;

public class OrderContent {
	
	private int idOrder;
	private int quantity;
	private int price;
	private int order;
	private int product;
	private String label;
	private String englishLabel;
	private String imgProduct;
	
	
	public String getEnglishLabel() {
		return englishLabel;
	}
	public void setEnglishLabel(String englishLabel) {
		this.englishLabel = englishLabel;
	}
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}	
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getImgProduct() {
		return imgProduct;
	}
	public void setImgProduct(String photo) {
		this.imgProduct = photo;
	}
	public OrderContent(){
		this.quantity = 0;
		this.price = 0;
	}
	
}
