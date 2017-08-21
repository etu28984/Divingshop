package com.spring.henallux.model;

public class TradPage {
	
	private int idTraductionPage;

	 private int idLanguage;

	 private String text;	

	 private String name;
	 
	 public TradPage()
	 {
		 this.idLanguage = 0;
		 this.text = new String();
		 this.name = new String();
	 }

	
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
