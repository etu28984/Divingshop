package com.spring.henallux.model;

public class TradProd {
	
	private int idTradProd;

	 private int idLanguage;

	 private String text;	
	 
	 private String label;

	 private int idProd;
	 
	 public TradProd()
	 {
		 this.idLanguage = 0;
		 this.text = new String();
		 this.label = new String();
		 this.idProd = 0;
	 }

	public int getIdTradProd() {
		return idTradProd;
	}

	public void setIdTradProd(int idTradProd) {
		this.idTradProd = idTradProd;
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

	public int getIdProd() {
		return idProd;
	}

	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	 
	 

}
