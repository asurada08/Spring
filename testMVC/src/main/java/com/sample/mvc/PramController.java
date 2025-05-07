package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/param")
public class PramController {// param/input ��û�ϸ�

	@RequestMapping(value="input", method=RequestMethod.GET)
	public String input() {
		return "input";//views/input.jsp �̷��� ã�ư�
	}
	
	@RequestMapping(value="/input", method=RequestMethod.POST)
	public String iputAction(String name, Model model) {
		//msg=" ~~~, your fridend..."
		model.addAttribute("msg", name+", your fridend...");
		
		return "iputAction";//views/iputAction.jsp �̷��� ã�ư�
	}
	@RequestMapping(value="hi",method=RequestMethod.GET)
	@ResponseBody
	public String hi() {
		return "<h1 style='color:red'>������ ��� ������!!!!</h1>"
				+ "<h2>���ݸ� ��������... ���� ���� �� �ſ���...</h2>";
	}
}
