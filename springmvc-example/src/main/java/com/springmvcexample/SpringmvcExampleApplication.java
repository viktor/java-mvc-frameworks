package com.springmvcexample;

import com.springmvcexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringmvcExampleApplication {
	
	@Autowired
	StudentService service;

	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		service.testData();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcExampleApplication.class, args);
	}

}
