package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringMailApplication {

	@Autowired
	EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringMailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		emailSenderService.sendEmail("kashyappallavi884@gmail.com",
				"This is subject",
				"This is email for testing");
	 }

}
