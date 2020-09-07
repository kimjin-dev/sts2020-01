package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AddController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		if("GET".equals(request.getMethod())) {
			mav.setViewName("emp/add");
		}else {
			mav.setViewName("redirect:list.bit");
		}
		
		return mav;
	}

}
