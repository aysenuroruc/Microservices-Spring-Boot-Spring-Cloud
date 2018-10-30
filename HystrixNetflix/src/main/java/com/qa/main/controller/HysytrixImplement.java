package com.qa.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class HysytrixImplement {

	@Autowired
	private HysytrixImplement hysytrixImplement;
	
	//ResponseEntity<String> exhange = null;
	
	@RequestMapping("/getAccounts")
	public String getAccounts() {
		return null;
		
	}
}
