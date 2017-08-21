package com.spring.henallux.dataAccess.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.entity.OrderContentEntity;
import com.spring.henallux.dataAccess.repository.OrderContentRepository;
import com.spring.henallux.dataAccess.util.Converter;
import com.spring.henallux.model.OrderContent;

@Service
@Transactional
public class OrderContentDao {
	
	@Autowired
	OrderContentRepository orderContentRepository;
	
	
	@Autowired
	Converter converter;
	
	public void addLine(OrderContent orderContent){
		OrderContentEntity orderContentEntity = converter.orderContentModelToEntity(orderContent);
		orderContentRepository.save(orderContentEntity);
	}
	
}
