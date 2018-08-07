package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.demo.filter.MyTransactionFilter;
import com.example.demo.filter.RequestResponseLoggingFilter;
import com.example.demo.interceptor.MyInterceptor;

@Configuration
public class MyConfig implements WebMvcConfigurer{

	
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

	
}
