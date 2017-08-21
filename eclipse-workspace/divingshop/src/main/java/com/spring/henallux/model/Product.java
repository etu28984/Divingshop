package com.spring.henallux.model;

public class Product {
	
	

	private int idProduct;
	private String label;
	private String description;
	private String marque;
	private String model;
	private int price;
	private String imgProduct;
	private String englishDescription;
	private String englishLabel;
	
	public String getEnglishDescription() {
		return englishDescription;
	}
	public void setEnglishDescription(String englishDescription) {
		this.englishDescription = englishDescription;
	}
	public String getEnglishLabel() {
		return englishLabel;
	}
	public void setEnglishLabel(String englishLabel) {
		this.englishLabel = englishLabel;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	public String getImgProduct() {
		return imgProduct;
	}
	public void setImgProduct(String imgProduct) {
		this.imgProduct = imgProduct;
	}
	
	
	
	public Product(int idProduct, String label, String description, String marque, String model, int price) {
		super();
		this.idProduct = idProduct;
		this.label = label;
		this.description = description;
		this.marque = marque;
		this.model = model;
		this.price = price;
	}
	public Product(String label, String description, String marque, String model, int price) {
		super();
		this.label = label;
		this.description = description;
		this.marque = marque;
		this.model = model;
		this.price = price;
	}
	
	public Product(){
		this.idProduct = 0;
		this.label = new String();
		this.description = new String();
		this.model = new String();
		this.marque = new String();
		this.price = 0;
		this.imgProduct = new String();
		this.englishDescription = new String();
		this.englishLabel = new String();
	}
	
	
	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", label=" + label + ", description=" + description + ", marque="
				+ marque + ", model=" + model + ", price=" + price + ", imgProduct=" + imgProduct + "]";
	}
	

}
