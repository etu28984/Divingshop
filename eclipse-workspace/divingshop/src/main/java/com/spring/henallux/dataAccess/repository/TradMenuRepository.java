package com.spring.henallux.dataAccess.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.henallux.dataAccess.entity.TradMenuEntity;




@Repository
@Transactional
public interface TradMenuRepository extends JpaRepository<TradMenuEntity, String>{
 
	public List<TradMenuEntity> findAllByIdLanguage(int idLanguage);

}