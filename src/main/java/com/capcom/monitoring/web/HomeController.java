package com.capcom.monitoring.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//@RequestMapping(method = RequestMethod.GET)
	//@ResponseBody
	@RequestMapping("/welcome")
	public String home() {
		System.out.println("WELCOMEEEEE");
		return "welcome";
	}
	
	@RequestMapping("/signin")
	//@ResponseBody
	public String signin() {
		System.out.println("SignINNNNNNNN");
		return "signin";
	}
	
	@RequestMapping("/index")
	//@ResponseBody
	public String index() {
		System.out.println("Indexxxxxxxxxx");
		return "index";
	}

	@RequestMapping("/foo")
	public String foo(Map<String, Object> model) {
		throw new RuntimeException("Foo");
	}
	
	@RequestMapping("/uitest")
	public String uitest() {
		System.out.println("uitest");
		return "uitest";
	}
	
}
