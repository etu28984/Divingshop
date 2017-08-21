package com.spring.henallux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.dataAccess.dao.TradMenuDao;
import com.spring.henallux.dataAccess.dao.UserDao;
import com.spring.henallux.model.CurrentSession;
import com.spring.henallux.model.Order;
import com.spring.henallux.model.TradMenu;
import com.spring.henallux.model.User;

@Controller
@RequestMapping(value="/about")
@SessionAttributes({"currentSession"})
public class AboutController {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	TradMenuDao tradMenuDao;
	
	@ModelAttribute("currentSession")
	public CurrentSession FreeSession(){
		CurrentSession curSess = new CurrentSession();
		curSess.setCurrentUser(new User());
		curSess.setCurrentOrder(new Order());
		return curSess;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model, @ModelAttribute(value="currentSession")CurrentSession currentSession, @ModelAttribute(value="currentUser")User currentUser){
		
		int idLanguage = currentSession.getLanguage();
		List<TradMenu> listMenu = tradMenuDao.getAllByLanguage(idLanguage);
		model.addAttribute("listMenu", listMenu);
		
		model.addAttribute("currentUser", new User());
		model.addAttribute("userlog", new User());
		currentSession.setCurrentPage("about");
		model.addAttribute("currentSession",currentSession);
		return "integrated:about";
	}
	

}
