package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tradprod")
public class TradProductEntity {
 
	 @Id
	 @Column(name="idtradprod", nullable=false)
	 private int idTraductionProduct;
	 
	 @Column(name="idlanguage", nullable=false)
	 private int idLanguage;
	 
	 @Column(name="text", nullable=false)
	 private String text;	
	 
	 @Column(name="label", nullable=false)
	 private String label;	
	 
	 @Column(name="idprod", nullable=false)
	 private int idProduct;

	public int getIdTraductionProduct() {
		return idTraductionProduct;
	}

	public void setIdTraductionProduct(int idTraductionProduct) {
		this.idTraductionProduct = idTraductionProduct;
	}

	public int getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(int idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	
	
	


	
 
 }