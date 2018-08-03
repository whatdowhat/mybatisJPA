package com.example.demo.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

public class MyEventOne extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5602341729680522968L;

	private boolean myKey;
	
	private String name;
	
	public MyEventOne(Object source,boolean mykey,String name) {
		super(source);
		
		this.myKey = mykey;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	public boolean isMyKey() {
		return myKey;
	}

	public void setMyKey(boolean myKey) {
		this.myKey = myKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
