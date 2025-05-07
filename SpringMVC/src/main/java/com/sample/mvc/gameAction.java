package com.sample.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class gameAction extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String youNum = req.getParameter("you");
		String comNum = (int)(Math.random()*3+1) + "";
		ModelAndView mv = new ModelAndView();
		if((youNum.equals("1") && comNum.equals("2")) ||
		   (youNum.equals("2") && comNum.equals("3")) ||
		   (youNum.equals("3") && comNum.equals("1"))) {
			mv.addObject("msg", "얼레리 꼴레리 졌데요~");
		} else if (youNum.equals(comNum)) {
			mv.addObject("msg", "아~ 깝이~");
		} else {
			mv.addObject("msg", "오~ 왠열~");
		}
		System.out.println(">>>>> youNum : " + youNum + ", comNum : " + comNum);
		mv.setViewName("gameresult");//WEB-INF/views/gameresult.jsp
		
		return mv;
	}
	
	
}
