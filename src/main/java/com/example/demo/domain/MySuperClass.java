package com.example.demo.domain;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name ="type" )
public class MySuperClass {

	@Id
	@GeneratedValue
	private int id;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date upDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpDate() {
		return upDate;
	}

	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}

	@Override
	public String toString() {
		return "MySuperClass [id=" + id + ", regDate=" + regDate + ", upDate=" + upDate + "]";
	}
	
	
}
