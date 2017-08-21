package com.spring.henallux.dataAccess.util;

import org.springframework.stereotype.Component;

import com.spring.henallux.dataAccess.entity.OrderContentEntity;
import com.spring.henallux.dataAccess.entity.OrderEntity;
import com.spring.henallux.dataAccess.entity.ProductEntity;
import com.spring.henallux.dataAccess.entity.TradMenuEntity;
import com.spring.henallux.dataAccess.entity.TradPageEntity;
import com.spring.henallux.dataAccess.entity.TradProductEntity;
import com.spring.henallux.dataAccess.entity.UserEntity;
import com.spring.henallux.model.Order;
import com.spring.henallux.model.OrderContent;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.TradMenu;
import com.spring.henallux.model.TradPage;
import com.spring.henallux.model.TradProd;
import com.spring.henallux.model.User;

@Component
public class Converter {
	
	
	
	
	public UserEntity userModelToUserEntity(User user)
	{
		UserEntity userEntity = new UserEntity();
		userEntity.setId(user.getId());
		userEntity.setLogin(user.getLogin());
		userEntity.setPassword(user.getPassword());
		userEntity.setLastName(user.getLastName());
		userEntity.setFirstName(user.getFirstName());
		userEntity.setAdresse(user.getAddress());
		userEntity.setEmail(user.getEmail());
		userEntity.setMobilePhone(user.getMobilePhoneNumber());
		userEntity.setPhoneNumber(user.getPhoneNumber());
		return userEntity;
	}
	
	public User userEntityToUserModel(UserEntity userEntity)
	{
		User user = new User();
		user.setId(userEntity.getId());
		user.setLogin(userEntity.getLogin());
		user.setPassword(userEntity.getPassword());
		user.setLastName(userEntity.getLastName());
		user.setFirstName(userEntity.getFirstName());
		user.setAddress(userEntity.getAdresse());
		user.setEmail(userEntity.getEmail());
		user.setMobilePhoneNumber(userEntity.getMobilePhone());
		user.setPhoneNumber(userEntity.getPhoneNumber());
		return user;
	}
	
	public Product productEntityToModel(ProductEntity productEntity)
	{
		Product product = new Product();
		product.setIdProduct(productEntity.getIdProduct());
		product.setDescription(productEntity.getDescription());
		product.setLabel(productEntity.getLabel());
		product.setMarque(productEntity.getMarque());
		product.setModel(productEntity.getModel());
		product.setPrice(productEntity.getPrice());
		product.setImgProduct(productEntity.getImgProduct());
		product.setEnglishDescription(productEntity.getEnglishDescription());
		product.setEnglishLabel(productEntity.getEnglishLabel());
		return product;
	}
	
	public OrderContentEntity orderContentModelToEntity(OrderContent orderContent)
	{
		OrderContentEntity orderContentEntity = new OrderContentEntity();
		orderContentEntity.setPrice(orderContent.getPrice());
		orderContentEntity.setQuantity(orderContent.getQuantity());
		orderContentEntity.setProduct(orderContent.getProduct());
		orderContentEntity.setOrder(orderContent.getOrder());
		return orderContentEntity;
	}
	
	public OrderContent orderContentEntityToModel(OrderContentEntity orderContentEntity)
	{
		OrderContent orderContent = new OrderContent();
		orderContent.setPrice(orderContentEntity.getPrice());
		orderContent.setQuantity(orderContentEntity.getQuantity());
		orderContent.setProduct(orderContentEntity.getProduct());
		orderContent.setOrder(orderContentEntity.getOrder());
		return orderContent;
	}
	
	public OrderEntity orderModelToEntity(Order order)
	{
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setIdOrder(order.getIdOrder());
		orderEntity.setUser(order.getUser());
		return orderEntity;
	}
	
	public Order orderEntityToModel(OrderEntity orderEntity)
	{
		Order order = new Order();
		order.setIdOrder(orderEntity.getIdOrder());
		order.setUser(orderEntity.getUser());
		return order;
	}
	
	 public TradMenuEntity traductionMenuModelToTraductionMenuEntity(TradMenu traductionMenu)
	 {
		 TradMenuEntity traductionMenuEntity = new TradMenuEntity();
		 traductionMenuEntity.setIdTraductionMenu(traductionMenu.getIdTraductionMenu());
		 traductionMenuEntity.setIdLanguage(traductionMenu.getIdLanguage());
		 traductionMenuEntity.setName(traductionMenu.getName());
		 traductionMenuEntity.setText(traductionMenu.getText());  
		 return traductionMenuEntity;
	 }
	 
	 public TradMenu traductionMenuEntityToTraductionMenuModel(TradMenuEntity  traductionMenuEntity)
	 {
		 TradMenu traductionMenu = new TradMenu();
		 traductionMenu.setIdTraductionMenu(traductionMenuEntity.getIdTraductionMenu());
		 traductionMenu.setIdLanguage(traductionMenuEntity.getIdLanguage());
		 traductionMenu.setName(traductionMenuEntity.getName());
		 traductionMenu.setText(traductionMenuEntity.getText());  
		 return traductionMenu;
	 }
	 
	 public TradPageEntity traductionPageModelToTraductionPageEntity(TradPage traductionPage)
	 {
		 TradPageEntity traductionPageEntity = new TradPageEntity();
		 traductionPageEntity.setIdTraductionPage(traductionPage.getIdTraductionPage());
		 traductionPageEntity.setIdLanguage(traductionPage.getIdLanguage());
		 traductionPageEntity.setName(traductionPage.getName());
		 traductionPageEntity.setText(traductionPage.getText());  
		 return traductionPageEntity;
	 }
	 
	 public TradPage traductionPageEntityToTraductionPageModel(TradPageEntity traductionPageEntity)
	 {
		 TradPage traductionPage = new TradPage();
	     traductionPage.setIdTraductionPage(traductionPageEntity.getIdTraductionPage());
	     traductionPage.setIdLanguage(traductionPageEntity.getIdLanguage());
	     traductionPage.setName(traductionPageEntity.getName());
	     traductionPage.setText(traductionPageEntity.getText());  
	     return traductionPage;
	 }
	 
	public TradProductEntity traductionProductModelToTraductionProductEntity(TradProd traductionProduct)
	 {
		TradProductEntity traductionProductEntity = new TradProductEntity();
	    traductionProductEntity.setIdTraductionProduct(traductionProduct.getIdTradProd());
	    traductionProductEntity.setIdLanguage(traductionProduct.getIdLanguage());
	    traductionProductEntity.setIdProduct(traductionProduct.getIdProd());
	    traductionProductEntity.setText(traductionProduct.getText());  
	    traductionProductEntity.setLabel(traductionProduct.getLabel());
	    return traductionProductEntity;
	 }
	 
	 public TradProd traductionProductEntityToTraductionProductModel(TradProductEntity traductionProductEntity)
	 {
		TradProd traductionProduct = new TradProd();
	    traductionProduct.setIdTradProd(traductionProductEntity.getIdTraductionProduct());
	    traductionProduct.setIdLanguage(traductionProductEntity.getIdLanguage());
	    traductionProduct.setIdProd(traductionProductEntity.getIdProduct());
	    traductionProduct.setText(traductionProductEntity.getText());  
	    traductionProduct.setLabel(traductionProductEntity.getLabel());  
	    return traductionProduct;
	 }
	
	
	
	
	
	
	

}
