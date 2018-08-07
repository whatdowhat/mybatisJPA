package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.filter.MyTransactionFilter;
import com.example.demo.filter.RequestResponseLoggingFilter;

@Configuration
public class MyConfig {

	
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
}
