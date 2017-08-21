package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.entity.TradPageEntity;
import com.spring.henallux.dataAccess.repository.TradPageRepository;
import com.spring.henallux.dataAccess.util.Converter;
import com.spring.henallux.model.TradPage;

@Service
@Transactional
public class TradPageDao {
	
	@Autowired
	TradPageRepository tradPageRepository;
	@Autowired
	Converter converter;
	
	
	public List<TradPage> getAllByLanguage(int idLanguage, String namePage)
	{
		List<TradPageEntity> pageEntities = tradPageRepository.findAllByIdLanguage(idLanguage);		
		ArrayList<TradPage> pageList = new ArrayList<TradPage>();
		
		
		for ( TradPageEntity pageEntity : pageEntities)
		{	
			if(pageEntity.getName().equals(namePage))
			{
				TradPage page = converter.traductionPageEntityToTraductionPageModel(pageEntity);			
				pageList.add(page);	
			}								
		}		
		
		return pageList;
	}
	

}
