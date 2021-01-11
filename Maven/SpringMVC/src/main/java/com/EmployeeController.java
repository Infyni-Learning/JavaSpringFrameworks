package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping(value ="open")
	public ModelAndView openEmployeeForm(@ModelAttribute("emp") Employee employee) { //DI for Employee class 
		ModelAndView mav = new ModelAndView();
		//mav.addObject(employee);	//key - emp 
		mav.setViewName("employeestore.jsp");
		return mav;
	}
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "storeEmployee",method = RequestMethod.POST)
	public ModelAndView storeEmployee(@ModelAttribute("emp") Employee employee) {
		ModelAndView mav = new ModelAndView();
		String result = employeeService.storeEmpoyee(employee);
		System.out.println(result);
		mav.setViewName("employeestore.jsp");
		return mav;
	}
}
