package com.toread.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.toread.core.domain.CoreAccount;
import com.toread.core.service.CoreAccountService;

@Controller
public class LoginAction {
	
	@Autowired
	private CoreAccountService coreAccountService;
	
	@RequestMapping("login")
	public String getlogInPage(){
		return "app/login/login";
	}
	
	@RequestMapping("accountList")
	public ModelAndView getListAccount(){
		ModelAndView mv = new ModelAndView("app/login/accountList");
		List<CoreAccount> accounts = coreAccountService.getListAccounts();
		mv.addObject("accountList", accounts);
		return mv;
	}
	
}
