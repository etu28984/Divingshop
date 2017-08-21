package com.spring.henallux.model;

import java.util.HashMap;

public class Order {
	
	private int idOrder;
	
	private Integer user;
	private HashMap<Integer,OrderContent> listOrderContent;
	
	
	public int getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public HashMap<Integer, OrderContent> getListOrderContent() {
		return listOrderContent;
	}
	public void setListOrderContent(HashMap<Integer, OrderContent> listOrderContent) {
		this.listOrderContent = listOrderContent;
	}
	
	public void addOrderContent(Integer idOrder, OrderContent orderContent) {
		this.listOrderContent.put(idOrder, orderContent);
	}
	
	
	
	public Order()
	{
		this.user=null;
		this.listOrderContent=new HashMap<Integer,OrderContent>();
	}
	
	

}
