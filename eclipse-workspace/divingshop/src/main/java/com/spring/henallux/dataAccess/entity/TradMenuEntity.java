package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tradmenu")
public class TradMenuEntity {
 
	  	@Id
	  	@Column(name="idtradmenu", nullable=false)
	  	private int idTraductionMenu;
	  
	  	@Column(name="idlanguage", nullable=false)
	  	private int idLanguage;
	  
	  	@Column(name="text", nullable=false)
	  	private String text; 
	  
	  	@Column(name="name", nullable=false)
	  	private String name;

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