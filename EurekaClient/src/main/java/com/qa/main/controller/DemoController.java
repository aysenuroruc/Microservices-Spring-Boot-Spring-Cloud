package com.qa.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/getName")
	public String getName() {
		System.out.println("inside client project");
	return "Demo Project";
	}

}
