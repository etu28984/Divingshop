package com.spring.henallux.dataAccess.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.henallux.dataAccess.entity.OrderEntity;


@Repository
@Transactional
public interface OrderRepository extends JpaRepository<OrderEntity, String>{	
	public OrderEntity findByIdOrder(int idOrder);	

}
