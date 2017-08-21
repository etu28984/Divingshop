package com.spring.henallux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.model.CurrentSession;
import com.spring.henallux.model.Order;
import com.spring.henallux.model.User;


@Controller
@RequestMapping(value="/language")
@SessionAttributes({InternationlizationController.CURRENTSESSION})
public class InternationlizationController{ 

	 protected static final String CURRENTSESSION = "currentSession"; 
	   
	  @ModelAttribute(CURRENTSESSION)
	  public CurrentSession currentSession() {
		  CurrentSession currentSession = new CurrentSession();
		  currentSession.setCurrentUser(new User());
		  currentSession.setCurrentOrder(new Order());
		  return currentSession;
	  }
	
	 
	 @RequestMapping(method=RequestMethod.GET)
	 public String home(Model model,
	    @ModelAttribute(value="currentSession") CurrentSession currentSession,
	    @RequestParam("idLanguage") int idLanguage) {
	  
		  currentSession.setLanguage(idLanguage);
		  return "redirect:/" + currentSession.getCurrentPage();
	 }
}