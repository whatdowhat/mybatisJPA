package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TWO")
public class MyChildrenTwo extends MySuperClass {

	private String singer;

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "MyChildrenTwo [singer=" + singer + "]";
	}


	
}
