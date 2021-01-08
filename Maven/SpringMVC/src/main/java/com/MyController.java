package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "welcome",method = RequestMethod.GET)		//doGet Method 
	public ModelAndView sayHello() {
		System.out.println("I Came here");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		return mav;
	}
	
	@RequestMapping(value = "hi",method = RequestMethod.GET)		//doGet Method 
	public ModelAndView sayHi() {
		System.out.println("I Came here in Hi method");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("abc.jsp");
		return mav;
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public ModelAndView checkUser(HttpServletRequest req) {	//DI for request object 
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		ModelAndView mav = new ModelAndView();
		if(user.equals("Ajay") && pass.equals("Kumar")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
}
