package com.bit.framework.emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.framework.emp.model.EmpDao;

public class ListController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		EmpDao dao = new EmpDao();
		ModelAndView mav=new ModelAndView();
		mav.addObject("alist", dao.selectAll());
		mav.setViewName("emp/list");
		return mav;
	}

}
