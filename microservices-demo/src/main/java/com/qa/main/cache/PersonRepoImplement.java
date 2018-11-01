package com.qa.main.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class PersonRepoImplement implements PersonRepository{

	@Override
	@Cacheable
	public PersonData getDetails(String name) {
		// TODO Auto-generated method stub
		delay();
		
		return new PersonData("name", "Any person");
	}
	
	public void delay() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
