package com.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("key", "Login Page");
		mav.setViewName("login");
		return mav;
	}

	@GetMapping("/dashboard")
	public ModelAndView dashboard() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("key", "Dashboard");
		mav.setViewName("dashboard");
		return mav;
	}
	
	@GetMapping("/bills")
	public ModelAndView getBill() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("key", "Billing portal");
		mav.setViewName("bills");
		return mav;
	}
	
	@GetMapping("/promotions")
	public ModelAndView getPromotion() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("key", "Promotions portal");
		mav.setViewName("promotions");
		return mav;
	}
	
	@GetMapping("/ticket")
	public ModelAndView getTicket() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("key", "Ticketing portal");
		mav.setViewName("tickets");
		return mav;
	}
	

	@GetMapping("/reports")
	public ModelAndView getReport() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("key", "Reports");
		mav.setViewName("reports");
		return mav;
	}
}
