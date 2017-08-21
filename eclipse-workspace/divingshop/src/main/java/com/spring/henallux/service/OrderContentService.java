package com.spring.henallux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.dao.OrderContentDao;
import com.spring.henallux.dataAccess.dao.OrderDao;
import com.spring.henallux.model.OrderContent;

@Service
public class OrderContentService {
	
	@Autowired
	OrderContentDao orderContentDao;
	
	@Autowired
	OrderDao orderDao;
	
	public void addLine(int idOrder, OrderContent orderContent) {
		orderContent.setOrder(idOrder);
		orderContentDao.addLine(orderContent);
	}

}
