package com.qa.main.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
	
	@Scheduled(fixedRate=2000)
	public void task() {
		System.out.println("*****Scheduled********");
	}

}
