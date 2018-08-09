package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.springframework.ui.velocity.VelocityEngineUtils;

@Component
public class EmailServiceImpl {

	@Autowired
	public JavaMailSender emailSender;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private VelocityEngine velocityEngine;



	@Autowired
	public SimpleMailMessage template;
	
	
	 public void sendSimpleMessage(
	      String to, String subject, String text) {
	        
	        SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setTo(to); 
	        message.setSubject(subject); 
	        message.setText(template.getText());
	        
	       
	        emailSender.send(message);
	        

	        
	    }
	    
	public void sendConfirmationEmail(
			String to,
			String subject,
			String text) {
		
		
		MimeMessagePreparator preparator = new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				// TODO Auto-generated method stub
				
				
				MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
				message.setTo(to);
				message.setFrom("dowhatwho");
				Map model = new HashMap<>();
				model.put("myparam", "this is something!!");
				String text= VelocityEngineUtils.mergeTemplateIntoString(
			               // velocityEngine, "com/example/demo/util/test.vm", model);
				velocityEngine, "templates/email/test.vm", model);
				
				 message.setText(text, true);
				
				
			}
			
		};
		
		this.mailSender.send(preparator);
		
	}    
	    
	
}
