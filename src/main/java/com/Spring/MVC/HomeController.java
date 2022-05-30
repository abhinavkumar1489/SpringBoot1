package com.Spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	
	@RequestMapping("/home")
		public String home() {
		System.out.println("hey-Print");
		return "home.jsp";
	}
	@ResponseBody
	@RequestMapping("/inside")
	public String inside() {
	System.out.println("hey-Print 2times");
	return "inside home.jsp mama-23456";
}
}