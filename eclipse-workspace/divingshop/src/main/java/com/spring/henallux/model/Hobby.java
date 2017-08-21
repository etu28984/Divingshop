package com.spring.henallux.model;

public class Hobby {

	private String id, name;
	
	public Hobby () {}
	
	public Hobby (String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId () {
		return id;
	}
	
	public String getName () {
		return name;
	}
	
	public void setId (String id) {
		this.id = id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
}
