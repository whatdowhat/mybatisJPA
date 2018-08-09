package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.listener.MyEventOne;
import com.example.demo.util.EmailServiceImpl;

@Controller
public class MyController {

	@Autowired
	ApplicationEventPublisher applicationEventPublisher;
	
    @Autowired
    private  EmailServiceImpl emailServiceImpl;
    
	@RequestMapping("/home")
	String home() {
		MyEventOne event = new MyEventOne(this, true, "what?!");
		
		
		applicationEventPublisher.publishEvent(event);
		
		
		return "home";
	}
	
	
	@RequestMapping("/send")
	void sendEmailExample(){
       
	   
	   // String text = String.format(template.getText(), null);  
	    emailServiceImpl.sendSimpleMessage("dowhatwho@gmail.com", "this is title?", "content text!!!");
	    
	}
	@RequestMapping("/send2")
	void sendEmailExample2(){
       
	   
	   // String text = String.format(template.getText(), null);  

	    emailServiceImpl.sendConfirmationEmail("dowhatwho@gmail.com", "this is title?", "content text!!!");
	}
	
	
}
