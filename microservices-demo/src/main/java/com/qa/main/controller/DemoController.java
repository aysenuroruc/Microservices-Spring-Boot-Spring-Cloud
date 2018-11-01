package com.qa.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.service.ServicePerson;



@RestController
public class DemoController {
	
   @Autowired
   private JdbcTemplate jdbcTemplate;
	
   @Autowired
   private ServicePerson serviceperson;
   
   @RequestMapping(value="/getPersonData", method=RequestMethod.GET)
   public ServicePerson getPersonData() {
	 serviceperson.setId("1");
	 serviceperson.setAge("5");
	 serviceperson.setHeight("8");
	 serviceperson.setName("aysenur"); 
	 return serviceperson;	 
	 
 }
   @RequestMapping("getData")
   public String demo() {
	   return "ssl trying";
   }
   
   @RequestMapping(value="/createTable", method= RequestMethod.GET)
   public void createTable() {
	   try {
		   jdbcTemplate.execute("CREATE TABLE CUSTOMERDATA("+ 
	   "id SERIAL, name VARCHAR(255), age VARCHAR(255))");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	   
   }
   @RequestMapping(value="/putData", method= RequestMethod.GET)
   public void putData() {
	   jdbcTemplate.execute("INSERT INTO CUSTOMERDATA(id, name, age) VALUES(1, 'AYSENUR', '30')");
   }
   
   @RequestMapping("/tests")
   public RuntimeException demoTest() {
	   
	   throw new RuntimeException("demo test exeption");
   }
   @RequestMapping("/test")
   public String test() {
	   return "Succes";
   }
 
}
