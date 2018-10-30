package com.qa.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.config.ConfigProp;

@RestController
public class DemoController {
	@Autowired
	private ConfigProp configProp;
	
	@RequestMapping("/getName")
	public String configTestMethod() {
		return configProp.getAppName();
	}

}
