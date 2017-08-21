package com.spring.henallux.dataAccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordercontent")
public class OrderContentEntity {
	
	@Id
	@GeneratedValue
	@Column(name="idordercontent",  nullable=false)
	private int idOrderContent;
	
	@Column(name="quantity", nullable=false)
	private int quantity;
	
	@Column(name="price", nullable=false)
	private int price;
	
	@Column(name="orderid", nullable=false)
	private int order;
	
	@Column(name="productid", nullable=false)
	private int product;

	public int getIdOrderContent() {
		return idOrderContent;
	}

	public void setIdOrderContent(int idOrderContent) {
		this.idOrderContent = idOrderContent;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}
	
	

}
