package com.spring.henallux.controller;

import java.awt.print.Printable;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.henallux.dataAccess.dao.ProductDao;
import com.spring.henallux.dataAccess.dao.TradMenuDao;
import com.spring.henallux.dataAccess.dao.TradProdDao;
import com.spring.henallux.dataAccess.dao.UserDao;
import com.spring.henallux.model.CurrentSession;
import com.spring.henallux.model.Order;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.TradMenu;
import com.spring.henallux.model.TradProd;
import com.spring.henallux.model.User;

@Controller
@RequestMapping(value="/welcome")
@SessionAttributes({WelcomeController.CURRENTSESSION})
public class WelcomeController {
	
	protected static final String CURRENTSESSION = "currentSession";
	
	@ModelAttribute(CURRENTSESSION)
	public CurrentSession FreeSession(){
		CurrentSession currentSess = new CurrentSession();
		currentSess.setCurrentUser(new User());
		currentSess.setCurrentOrder(new Order());
		currentSess.setCurrentPage("welcome");
		if(currentSess.getLanguage()==0)
			currentSess.setLanguage(1);
		return currentSess;
		
	}
	
	@Autowired
	private UserDao userDao;
	
	@Autowired 
	private ProductDao productDao;
	
	@Autowired
	private TradMenuDao tradMenuDao;
	
	@Autowired
	private TradProdDao tradProdDao;
	
	

	@RequestMapping(method=RequestMethod.GET)
	public String home (Model model, @ModelAttribute(value="currentSession")CurrentSession currentSession) {
		
		model.addAttribute("userlog", new User());
		currentSession.setCurrentPage("welcome");
		
		int idLanguage = currentSession.getLanguage();
		List<TradMenu> listMenu = tradMenuDao.getAllByLanguage(idLanguage);
		model.addAttribute("listMenu", listMenu);
		
		List<TradProd> products = tradProdDao.getAllByLanguage(idLanguage);
		model.addAttribute(products);
		
		
		List<Product> listProduct = productDao.getAllProducts();
		
		

		
		for(Product prod : listProduct)
		{
			System.out.println("TEST CONVERT PROD"+tradProdDao.getProduct(prod.getIdProduct(), idLanguage).getLabel());
			prod.setLabel(tradProdDao.getProduct(prod.getIdProduct(), idLanguage).getLabel());
		}
		
		
		
		
		Product product = new Product();
		model.addAttribute("product", product);
		model.addAttribute("listproduct", listProduct);

		
		
		
		model.addAttribute("currentSession",currentSession);
		
		return "integrated:welcome";
	}
	
	
	
	@RequestMapping(value="/product", method=RequestMethod.POST)
	public String redirectProduct(Model model, @ModelAttribute(value=CURRENTSESSION)CurrentSession currentSession, @RequestParam("idProduct") int idProduct, RedirectAttributes redirectAttributes){
		
		
		redirectAttributes.addAttribute("idProduct", idProduct);
		return "redirect:/product";
		
	}
	
	@RequestMapping(value="/deconnection", method=RequestMethod.GET)
	public String deconnection(Model model,@ModelAttribute(value="currentSession")CurrentSession currentSession,SessionStatus sessionStatus){
		sessionStatus.setComplete();
		return "redirect:/welcome";
	}
	
	
	
	

	
	
	
	
}