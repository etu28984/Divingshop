package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tradpage")
public class TradPageEntity {
 
	 @Id
	 @Column(name="idtradpage", nullable=false)
	 private int idTraductionPage;
	 
	 @Column(name="idlanguage", nullable=false)
	 private int idLanguage;
	 
	 @Column(name="text", nullable=false)
	 private String text;	
	 
	 @Column(name="namepage", nullable=false)
	 private String name;


	public int getIdTraductionPage() {
		return idTraductionPage;
	}

	public void setIdTraductionPage(int idTraductionPage) {
		this.idTraductionPage = idTraductionPage;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
 
 }