package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/param")
public class ParamController {
	
	@RequestMapping(value="input", method = RequestMethod.GET)
	public String input() {	
		return "input";//views/input.jsp 이렇게 찾아감
	}
	
	@RequestMapping(value="input", method = RequestMethod.POST)
	public String inputAction(String name, Model model) {
		model.addAttribute("msg", name + ", your fridend!");
		
		return "inputAction";//views/inputAction.jsp 이렇게 찾아감	
	}
	
	@RequestMapping(value = "hi", method = RequestMethod.GET, produces = "text/html; charset=utf-8")//hi로 맵핑
	@ResponseBody //브라우저에 리턴값을 출력
	public String hi() {
		return "<h1 style='color:red'>여러분 집에가세요~</h1>" + "<h2>금요일에 만나요~</h2>";
	}
}
