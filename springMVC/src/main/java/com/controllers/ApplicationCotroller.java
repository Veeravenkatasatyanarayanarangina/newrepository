package com.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationCotroller {
	
	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phno = request.getParameter("phno");
		
		ModelAndView mv =new ModelAndView();
		
		mv.addObject("username", username);
		mv.addObject("password", password);
		mv.addObject("phno", phno);
		mv.setViewName("display");
		
		return mv;
	}
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		int first = Integer.parseInt(request.getParameter("first"));
		int second = Integer.parseInt(request.getParameter("second"));
		ModelAndView mv =new ModelAndView();
		
		mv.addObject("addvalue",first+second);
		mv.setViewName("adddisplay");
		return mv;	
	}

}
