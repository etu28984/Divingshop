package com.spring.henallux.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.dataAccess.dao.OrderContentDao;
import com.spring.henallux.dataAccess.dao.OrderDao;
import com.spring.henallux.dataAccess.dao.TradMenuDao;
import com.spring.henallux.dataAccess.dao.TradPageDao;
import com.spring.henallux.model.CurrentSession;
import com.spring.henallux.model.Order;
import com.spring.henallux.model.OrderContent;
import com.spring.henallux.model.Product;
import com.spring.henallux.model.TradMenu;
import com.spring.henallux.model.TradPage;
import com.spring.henallux.model.User;
import com.spring.henallux.service.OrderContentService;
import com.spring.henallux.service.OrderService;

@Controller
@RequestMapping(value="/basket")
@SessionAttributes({"currentSession"})
public class BasketController {
	
	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private OrderContentDao orderContentDao;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderContentService orderContentService;
	
	@Autowired
	private TradMenuDao tradMenuDao;
	
	@Autowired
	private TradPageDao tradPageDao;
	
	@ModelAttribute("currentSession")
	public CurrentSession FreeSession(){
		CurrentSession curSess = new CurrentSession();
		curSess.setCurrentUser(new User());
		curSess.setCurrentOrder(new Order());
		return curSess;
	}
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, @ModelAttribute(value="currentSession")CurrentSession currentSession) {
		
		
		int idLanguage = currentSession.getLanguage();
		List<TradMenu> listMenu = tradMenuDao.getAllByLanguage(idLanguage);
		model.addAttribute("listMenu", listMenu);
		
		String pageName = "basket";
		List<TradPage> listPage = tradPageDao.getAllByLanguage(idLanguage, pageName);
		model.addAttribute("listPage", listPage);
		
		Order order = currentSession.getCurrentOrder();
		
		model.addAttribute("order", order);
		model.addAttribute("orderContent", order.getListOrderContent());
		
		model.addAttribute("userlog", new User());
		currentSession.setCurrentPage("basket");
		
		double totPrice = 0;
		
		HashMap<Integer, OrderContent> allProductUser = order.getListOrderContent();
		HashMap<Integer, String> allProductFrenchLabel = new HashMap<Integer, String>();
		HashMap<Integer, String> allProductEnglishLabel = new HashMap<Integer, String>();
		
		
		for(Integer key : order.getListOrderContent().keySet()) {
			System.out.println("Test Panier"+allProductUser.get(key).getLabel());
			totPrice = totPrice+allProductUser.get(key).getPrice()*allProductUser.get(key).getQuantity();
			//System.out.println("Product"+locale.toString());
			allProductFrenchLabel.put(key, allProductUser.get(key).getLabel());
			allProductEnglishLabel.put(key, allProductUser.get(key).getEnglishLabel());
			
		}
		
		

				
		
		model.addAttribute("totPrice", totPrice);
		
		model.addAttribute("currentSession",currentSession);
		

		
		return "integrated:basket";
	}
	
	
	@RequestMapping(value="/valid", method=RequestMethod.POST)
	public String validOrder(Model model, @ModelAttribute(value="currentSession") CurrentSession currentSession){
		Order order = currentSession.getCurrentOrder();

		if(currentSession.getCurrentUser().getId()!=0)
		{
			HashMap<Integer,OrderContent> listBasket= order.getListOrderContent();
			
			Order repOrder = orderService.addOrder(currentSession.getCurrentUser().getId());
			
			for(Integer key : order.getListOrderContent().keySet()){
				orderContentService.addLine(repOrder.getIdOrder(), listBasket.get(key));
			}
			
			currentSession.setCurrentOrder(new Order());

		}
		else{
			return "redirect:/connection";
		};
		
		return "redirect:/welcome";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String continueShop(Model model, @ModelAttribute(value="currentSession") CurrentSession currentSession){
		
		
		return "redirect:/welcome";		
		
	}
	
	@RequestMapping(value="/delete",params={"idprod"}, method=RequestMethod.POST)
	public String deleteRow(Model model, @ModelAttribute(value="currentSession") CurrentSession currentSession,@RequestParam(required=false)int idprod){
		Order order = currentSession.getCurrentOrder();
		
			HashMap<Integer,OrderContent> listBasket= order.getListOrderContent();
			listBasket.remove(idprod);	
		
		return "redirect:/basket";
	}
	
	
	 @RequestMapping(value="/modifyquantity", method=RequestMethod.POST)
	 public String modifyProduct(Model model,
	    @ModelAttribute(value="currentSession") CurrentSession currentSession,
	    @RequestParam("idProduct")int idProduct,
	    @RequestParam("quantity")int quantity){

	  Order order = currentSession.getCurrentOrder(); 
	  HashMap<Integer,OrderContent> listorderContent= order.getListOrderContent();
	  OrderContent orderContent = listorderContent.get(idProduct);
	  orderContent.setQuantity(quantity);
	  orderContentDao.addLine(orderContent);

	  return "redirect:/basket";
	 }
	

}
