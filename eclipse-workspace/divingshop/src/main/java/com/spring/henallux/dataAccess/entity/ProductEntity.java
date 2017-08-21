package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity {
	
	@Id
	@Column(name="idproduct", nullable=false)
	private int idProduct;
	
	@Column(name="label",  nullable=false)
	private String label;
	
	@Column(name="description",  nullable=false)
	private String description;
	
	@Column(name="marque",  nullable=false)
	private String marque;
	
	@Column(name="model",  nullable=false)
	private String model;
	
	@Column(name="price",  nullable=false)
	private int price;
	
	@Column(name="imageproduct",  nullable=false)
	private String imgProduct;
	
	@Column(name="englishdescription",  nullable=false)
	private String englishDescription;
	
	@Column(name="englishlabel",  nullable=false)
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
	
	
	
	
	

}
