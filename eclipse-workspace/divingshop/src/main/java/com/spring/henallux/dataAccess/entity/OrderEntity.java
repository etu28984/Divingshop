package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrderEntity {
	
	@Id
	@GeneratedValue
	@Column(name="idorder",  nullable=false)
	private int idOrder;
	
	@Column(name="userid",  nullable=false)
	private Integer user;

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
	
	
	
	
}
