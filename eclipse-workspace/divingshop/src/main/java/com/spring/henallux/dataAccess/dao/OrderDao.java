package com.spring.henallux.dataAccess.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.entity.OrderEntity;
import com.spring.henallux.dataAccess.repository.OrderRepository;
import com.spring.henallux.dataAccess.util.Converter;
import com.spring.henallux.model.Order;

@Service
@Transactional
public class OrderDao {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	Converter converter;
	
	
	public Order addOrder(Order order)
	{
		OrderEntity orderEntity = converter.orderModelToEntity(order);
		OrderEntity reponse = orderRepository.save(orderEntity);
		return converter.orderEntityToModel(reponse);
	}
	
	public Order getOrder(int idOrder){
		OrderEntity orderEntity = orderRepository.findByIdOrder(idOrder);
		Order order = converter.orderEntityToModel(orderEntity);
		return order;
	}
	

}
