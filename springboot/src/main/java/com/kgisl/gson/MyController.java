package com.kgisl.gson;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class MyController {
    @RequestMapping(method = RequestMethod.GET)

	public String home(Model model) {
		System.out.println("MyController Requested, locale = ");
		model.addAttribute("serverTime", "formattedDate");
		return "home";
	}  
}
