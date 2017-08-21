package com.spring.henallux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.dao.OrderContentDao;
import com.spring.henallux.dataAccess.dao.OrderDao;
import com.spring.henallux.model.Order;

@Service
public class OrderService {
	
	@Autowired
	OrderContentDao orderContentDao;
	
	@Autowired
	OrderDao orderDao;
	
	public Order addOrder(int userId) {
		Order order = new Order();
		order.setUser(userId);
		Order orderFin = orderDao.addOrder(order);
		
		return orderFin;
	}

}
