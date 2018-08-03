package com.example.demo.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerSameple{

	
	@EventListener(condition = "#eventOne.name eq 'what?!'")
	public void MyEventOne(MyEventOne eventOne) {
		
		System.out.println("### event triger!!!");
		System.out.println("### EVET triger" );
		
	}
	
	//condition eventOne parameter same 
	
	@EventListener(condition = "#eventOne.myKey")
	public void MyEventOne2(MyEventOne eventOne) {
		
		System.out.println("### event triger!!!" + eventOne.getName());
		System.out.println("### EVET triger" );
		
	}
	
}
