package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.listener.MyEventOne;

@Controller
public class MyController {

	@Autowired
	ApplicationEventPublisher applicationEventPublisher;
	
	@RequestMapping("/home")
	String home() {
		MyEventOne event = new MyEventOne(this, true, "what?!");
		
		
		applicationEventPublisher.publishEvent(event);
		
		
		return "home";
	}
	
}
