package com.spring.henallux.model;

public class TradMenu {
	private int idTraductionMenu;

	  private int idLanguage;

	  private String text; 

	  private String name;
	  
	  public TradMenu()
	  {
	   this.idLanguage = 0;
	   this.text = new String();
	   this.name = new String();
	  }

	 public int getIdTraductionMenu() {
	  return idTraductionMenu;
	 }

	 public void setIdTraductionMenu(int idTraductionMenu) {
	  this.idTraductionMenu = idTraductionMenu;
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
