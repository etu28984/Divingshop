package com.spring.henallux.dataAccess.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.henallux.dataAccess.entity.TradPageEntity;

@Repository
@Transactional
public interface TradPageRepository extends JpaRepository<TradPageEntity, String>{
	
	public List<TradPageEntity> findAllByIdLanguage(int idLanguage);

}
