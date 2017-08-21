package com.spring.henallux.dataAccess.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.entity.ProductEntity;
import com.spring.henallux.dataAccess.repository.ProductRepository;
import com.spring.henallux.dataAccess.util.Converter;
import com.spring.henallux.model.Product;

@Service
@Transactional
public class ProductDao {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	Converter converter;
	
	
	public List<Product> getAllProducts(){
		List<ProductEntity>productEntities = productRepository.findAll();
		ArrayList<Product> allProducts= new ArrayList<Product>();
		for(ProductEntity productEntity : productEntities) {
			Product product = converter.productEntityToModel(productEntity);
			allProducts.add(product);
		}
		return allProducts;
	}
	
	public Product getProduct(int idProduct)
	{
		ProductEntity productEntity = productRepository.findByIdProduct(idProduct);
		Product product = converter.productEntityToModel(productEntity);
		return product;
	}
	

}
