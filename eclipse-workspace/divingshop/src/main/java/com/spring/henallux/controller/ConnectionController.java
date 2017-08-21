package com.spring.henallux.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.henallux.dataAccess.dao.TradMenuDao;
import com.spring.henallux.dataAccess.dao.TradPageDao;
import com.spring.henallux.dataAccess.dao.UserDao;
import com.spring.henallux.model.CurrentSession;
import com.spring.henallux.model.Order;
import com.spring.henallux.model.TradMenu;
import com.spring.henallux.model.TradPage;
import com.spring.henallux.model.User;
import com.spring.henallux.service.CryptageService;

@Controller
@RequestMapping(value="/connection")
@SessionAttributes({"currentSession"})
public class ConnectionController {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CryptageService cryptageService;
	
	@Autowired
	private TradMenuDao tradMenuDao;
	
	@Autowired
	private TradPageDao tradPageDao;
	
	@ModelAttribute("currentSession")
	  public CurrentSession currentSession() {
	  CurrentSession currentSession = new CurrentSession();
	  currentSession.setCurrentUser(new User());
	  currentSession.setCurrentPage("welcome");
	  return currentSession;
	 }
	
	@RequestMapping(method=RequestMethod.GET)
	public String home (Model model, @ModelAttribute(value="currentSession")CurrentSession currentSession) {
		
		int idLanguage = currentSession.getLanguage();
		List<TradMenu> listMenu = tradMenuDao.getAllByLanguage(idLanguage);
		model.addAttribute("listMenu", listMenu);
		
		String pageName = "connection";
		List<TradPage> listPage = tradPageDao.getAllByLanguage(idLanguage, pageName);
		model.addAttribute("listPage", listPage);
		
		model.addAttribute("userlog", new User());
		return "integrated:connection";
	}
	
	


	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String getFormData(Model model, @ModelAttribute(value="userlog")User userlog, @ModelAttribute(value="currentSession")CurrentSession currentSession) 
								{
		User userToCheck=userDao.findUser(userlog.getLogin());
		
		if(userToCheck.getLogin()!="")
		{
			
			String mdp = cryptageService.getEncodedPassword(userlog.getPassword());
	
			if(userToCheck.getPassword().equals(mdp))
			{
				CurrentSession sess= currentSession;
				sess.setCurrentUser(userToCheck);
				model.addAttribute("currentSession",sess);
				return "redirect:/"+currentSession.getCurrentPage();
			}
			else
			{
				return "redirect:/connection";
			}
		}
		else
		{
			return "redirect:/connection";
		}
	
		
	}

}
