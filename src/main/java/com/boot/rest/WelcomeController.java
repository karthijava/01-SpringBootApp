package com.boot.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/message")
	public ModelAndView welcomeMsg()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "welcome to springMVC....!");
		mav.setViewName("index");
		return mav;
	}

}
