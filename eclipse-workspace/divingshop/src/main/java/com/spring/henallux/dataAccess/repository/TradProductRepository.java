package com.spring.henallux.dataAccess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.henallux.dataAccess.entity.TradProductEntity;


public interface TradProductRepository extends JpaRepository<TradProductEntity, String>{
	
	public List<TradProductEntity> findAllByIdLanguage(int idLanguage);
	public TradProductEntity findByIdLanguageAndIdProduct(int idLanguage, int idProduct);

}
