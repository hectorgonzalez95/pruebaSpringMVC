package com.hector.appSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SegundaPagina {

	@RequestMapping(value = "segundaPagina", method = RequestMethod.GET)
	public String segundaPagina(Model model) {
		
		
		String palabra = "palabra de ejemplo";
		
		model.addAttribute("palabra", palabra);
		return "segundaPagina";
	}
}
