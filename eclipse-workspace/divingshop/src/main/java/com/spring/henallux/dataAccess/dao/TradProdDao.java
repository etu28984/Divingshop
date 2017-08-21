package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.entity.TradProductEntity;
import com.spring.henallux.dataAccess.repository.TradProductRepository;
import com.spring.henallux.dataAccess.util.Converter;
import com.spring.henallux.model.TradProd;

@Service
@Transactional
public class TradProdDao {
	
	@Autowired
	private TradProductRepository traductProductRepository;
	
	@Autowired
	private Converter converter;
	
	
	public List<TradProd> getAllByLanguage(int idLanguage)
	{
		List<TradProductEntity> productEntities = traductProductRepository.findAllByIdLanguage(idLanguage);		
		ArrayList<TradProd> productList = new ArrayList<TradProd>();
		
		
		for ( TradProductEntity productEntity : productEntities)
		{	
			TradProd product = converter.traductionProductEntityToTraductionProductModel(productEntity);			
			productList.add(product);	
											
		}		
		
		return productList;
	}
	
	public TradProd getProduct(int idProduct, int idLanguage)
	{
		TradProductEntity traductionProductEntity = traductProductRepository.findByIdLanguageAndIdProduct(idLanguage, idProduct);
		TradProd traductionProduct = converter.traductionProductEntityToTraductionProductModel(traductionProductEntity);
		
		return traductionProduct;
	}

}
