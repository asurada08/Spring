package com.sample.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/music")
public class MusicController {
	@RequestMapping(value="/rock")
	public void rock(Model model) {
		model.addAttribute("msg", "Rock and Roll~ ∫£¿Ã∫Ò~");
	}
	@RequestMapping(value="/funk")
	public void funk(Model model) {
		model.addAttribute("msg", "We will funk~");
	}
	@RequestMapping(value="/jazz")
	public void jazz(Model model) {
		model.addAttribute("msg", "We will jazz~");
	}
	@RequestMapping(value="/classic")
	public void classic(Model model) {
		model.addAttribute("msg", "We will classic~");
	}
}
