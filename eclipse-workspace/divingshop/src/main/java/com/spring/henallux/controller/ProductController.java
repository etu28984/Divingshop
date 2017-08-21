package com.spring.henallux.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.dataAccess.dao.OrderContentDao;
import com.spring.henallux.dataAccess.dao.ProductDao;
import com.spring.henallux.dataAccess.dao.TradMenuDao;
import com.spring.henallux.dataAccess.dao.TradProdDao;
import com.spring.henallux.model.CurrentSession;
import com.spring.henallux.model.Order;
import com.spring.henallux.model.OrderContent;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.TradMenu;
import com.spring.henallux.model.TradProd;
import com.spring.henallux.model.User;
import com.spring.henallux.service.OrderContentService;



@Controller
@RequestMapping(value="/product")
@SessionAttributes({"currentSession"})
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	OrderContentService orderContentService;
	
	@Autowired
	TradMenuDao tradMenuDao;
	
	@Autowired
	private TradProdDao tradProdDao;
	
	
	@ModelAttribute("currentSession")
	public CurrentSession FreeSession(){
		CurrentSession curSess = new CurrentSession();
		curSess.setCurrentUser(new User());
		curSess.setCurrentOrder(new Order());
		return curSess;
	}
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model,@ModelAttribute(value="currentSession")CurrentSession currentSession, @RequestParam(value="idProduct") int idProduct){
		
		int idLanguage = currentSession.getLanguage();
		List<TradMenu> listMenu = tradMenuDao.getAllByLanguage(idLanguage);
		model.addAttribute("listMenu", listMenu);
		
		
		TradProd traductionProduct = tradProdDao.getProduct(idProduct, idLanguage);
		Product product = productDao.getProduct(idProduct);	
		product.setLabel(traductionProduct.getLabel());
		product.setDescription(traductionProduct.getText());
		

		
		model.addAttribute("product", product);
		currentSession.setCurrentPage("product?idProduct="+idProduct);
		model.addAttribute("userlog", new User());
		model.addAttribute("currentSession",currentSession);
		
		
		OrderContent orderContent = new OrderContent();
		orderContent.setProduct(idProduct);
		
		model.addAttribute("orderContent", orderContent);
		
		
		return "integrated:product";
	}
	
	@RequestMapping(value="/basket", method=RequestMethod.POST)
	public String addToOrder(Model model, @ModelAttribute(value="product")Product product, @ModelAttribute(value="currentSession")CurrentSession currentSession, @ModelAttribute(value="orderContent")OrderContent orderContent){
		orderContent.setProduct(product.getIdProduct());
		
		
		currentSession.getCurrentOrder().addOrderContent(orderContent.getProduct(), orderContent);
		
		return "redirect:/basket";
	}
	
	
	

}
