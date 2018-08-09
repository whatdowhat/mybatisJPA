package com.example.demo.config;

import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.demo.filter.MyTransactionFilter;
import com.example.demo.filter.RequestResponseLoggingFilter;
import com.example.demo.interceptor.MyInterceptor;

@Configuration
public class MyConfig implements WebMvcConfigurer{

	
	@Value("${spring.mail.host}")
	private String mHost;
	@Value("${spring.mail.port}")
	private String mPort;
	@Value("${spring.mail.username}")
	private String mUsername;
	@Value("${spring.mail.password}")
	private String mPassword;
	@Value("${spring.mail.properties.mail.smtp.auth}")
	private String mAuth;
	@Value("${spring.mail.properties.mail.smtp.starttls.enable}")
	private String mEnable;
	
	@Bean
	public FilterRegistrationBean<RequestResponseLoggingFilter> loggingFilter(){
	    FilterRegistrationBean<RequestResponseLoggingFilter> registrationBean 
	      = new FilterRegistrationBean<>();
	         
	    registrationBean.setFilter(new RequestResponseLoggingFilter());
	    registrationBean.addUrlPatterns("/home");
	         
	    return registrationBean;    
	}
	@Bean
	public FilterRegistrationBean<MyTransactionFilter> myTransactionFilter(){
	    FilterRegistrationBean<MyTransactionFilter> registrationBean 
	      = new FilterRegistrationBean<>();
	         
	    registrationBean.setFilter(new MyTransactionFilter());
	    registrationBean.addUrlPatterns("/*");
	         
	    return registrationBean;    
	}
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addInterceptors(registry);
		
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/*");
	}
	
	@Bean
	public JavaMailSender getJavaMailSender() {
	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		
	    
	    
	    mailSender.setHost(mHost);
	    mailSender.setPort(Integer.parseInt(mPort));
	     
	    mailSender.setUsername(mUsername);
	    mailSender.setPassword(mPassword);
	     
	    Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.smtp.auth", mAuth);
	    props.put("mail.smtp.starttls.enable", mEnable);
	    props.put("mail.debug", "false");
	     
	    return mailSender;
	}
	
	@Bean
	public SimpleMailMessage templateSimpleMessage() {
	    SimpleMailMessage message = new SimpleMailMessage();
	    message.setText(
	      "This is the test email template for your email:\n%s\n");
	    return message;
	}
	
	@Bean
	public VelocityEngine velocityEngine()  {
	   
		VelocityEngine velocityEngine = new VelocityEngine();
		
		velocityEngine.setProperty("resource.loader", "class");
		velocityEngine.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		
	    return velocityEngine;
	}
}
