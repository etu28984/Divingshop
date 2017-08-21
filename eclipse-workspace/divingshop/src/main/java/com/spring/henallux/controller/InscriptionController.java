package com.spring.henallux.controller;

import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import javax.validation.Valid;

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
@RequestMapping(value="/userInscription")
@SessionAttributes({"currentSession"})
//@SessionAttributes({InscriptionController.CURRENTUSER})
public class InscriptionController {

	
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
	  currentSession.setCurrentOrder(new Order());
	  currentSession.setCurrentPage("welcome");
	  return currentSession;
	 }
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String home (Model model, @ModelAttribute(value="currentSession")CurrentSession currentSession) {
		
		int idLanguage = currentSession.getLanguage();
		List<TradMenu> listMenu = tradMenuDao.getAllByLanguage(idLanguage);
		model.addAttribute("listMenu", listMenu);
		currentSession.setCurrentPage("userInscription");
		
		String pageName = currentSession.getCurrentPage();
		List<TradPage> listPage = tradPageDao.getAllByLanguage(idLanguage, pageName);
		model.addAttribute("listPage", listPage);
		
		model.addAttribute("currentUser", new User());
		return "integrated:userInscription";
	}
	
	@RequestMapping(value="/send", method=RequestMethod.POST)
	public String getFormData(Model model, @ModelAttribute(value="currentUser")User currentUser, @ModelAttribute(value="currentSession")CurrentSession currentSession, final BindingResult errors) 
								{
		
		
		model.addAttribute("currentUser", new User());
		model.addAttribute("currentSession",currentSession);
		String mdp = currentUser.getPassword();
		String mdpConfirmation = currentUser.getConfirmationPassword();
		String phone = currentUser.getMobilePhoneNumber();
		boolean mdpEquals = (mdp.equals(mdpConfirmation));
		boolean emailCorrect = isValidEmailAddress(currentUser.getEmail());
		boolean phoneNumberCorrect = containOnlyNumber(phone);
		System.out.println("TEST PHONE"+currentUser.getPhoneNumber()+"        "+containOnlyNumber(currentUser.getPhoneNumber()) );
		boolean loginAlreadyExist = userDao.existLogin(currentUser.getLogin());
		
		if((currentUser.getPhoneNumber()!="") && !containOnlyNumber(currentUser.getPhoneNumber())) {
			return "redirect:/userInscription";
		}
		
		
		
		if (!errors.hasErrors() && emailCorrect && mdpEquals && phoneNumberCorrect && !loginAlreadyExist) {
			currentUser.setPassword(cryptageService.getEncodedPassword(currentUser.getPassword()));
			userDao.saveUser(currentUser);
			return "redirect:/welcome";
		}			
		else
			return "redirect:/userInscription";
	}
	
	public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
	}
	
	public boolean containOnlyNumber(String phone) {
		try {
			Integer.parseInt(phone);
		} catch (NumberFormatException e){
			return false;
		}
 
		return true;
	}
	
}