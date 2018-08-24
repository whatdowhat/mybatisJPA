package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

//@Component
@Order(1)
public class MyTransactionFilter implements Filter{

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		  HttpServletRequest req = (HttpServletRequest) request;
		  logger.info(
	          "Starting a transaction for req : {}", 
	          req.getRequestURI());
	  
	        chain.doFilter(request, response);
	        logger.info(
	          "Committing a transaction for req : {}", 
	          req.getRequestURI());
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}


}
