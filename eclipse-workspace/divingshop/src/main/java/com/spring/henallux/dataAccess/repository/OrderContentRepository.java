package com.spring.henallux.dataAccess.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.henallux.dataAccess.entity.OrderContentEntity;

@Repository
@Transactional
public interface OrderContentRepository extends JpaRepository<OrderContentEntity, String>{
	
	public List<OrderContentEntity> findByOrder(int idOrder);
	
}
