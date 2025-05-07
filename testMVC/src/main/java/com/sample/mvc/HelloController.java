package com.sample.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ModelAndView mv=new ModelAndView();
		//view 이름 셋팅
		mv.setViewName("hellocontrol");
		//view/hellocontrol.jsp내에 msg가 출력됨--> ${msg}
		mv.addObject("msg","hello Spring MVC...");
		
		return mv;
	}

}
