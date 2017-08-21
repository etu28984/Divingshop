package com.spring.henallux.dataAccess.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.henallux.dataAccess.entity.TradMenuEntity;
import com.spring.henallux.dataAccess.repository.TradMenuRepository;
import com.spring.henallux.dataAccess.util.Converter;
import com.spring.henallux.model.TradMenu;



@Service
@Transactional
public class TradMenuDao {
 
 @Autowired
 TradMenuRepository traductionMenuRepository;
 @Autowired
 Converter converter;
 
 
 public List<TradMenu> getAllByLanguage(int idLanguage)
 {
  List<TradMenuEntity> menuEntities = traductionMenuRepository.findAllByIdLanguage(idLanguage);  
  ArrayList<TradMenu> menuList = new ArrayList<TradMenu>();
  
  for ( TradMenuEntity menuEntity : menuEntities)
  {
	  TradMenu menu = converter.traductionMenuEntityToTraductionMenuModel(menuEntity);   
   menuList.add(menu);      
  }  
  
  return menuList;
 }

}