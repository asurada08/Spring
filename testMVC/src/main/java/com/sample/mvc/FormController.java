package com.sample.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class FormController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest 
			request, HttpServletResponse response)
			throws Exception {
		
		//view �̸�
		return new ModelAndView("form.jsp");
	}

}
