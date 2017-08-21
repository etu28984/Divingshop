package com.spring.henallux.model;


public class CurrentSession {
	
	private User currentUser;	
	private Order currentOrder;
	private String currentPage;
	private int langage;
	
	public User getCurrentUser() {
		return currentUser;
	}
	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	public Order getCurrentOrder() {
		return currentOrder;
	}
	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public int getLanguage() {
		return langage;
	}
	public void setLanguage(int language) {
		this.langage = language;
	}
	
	
	
	

}
