package com.example.demo.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class MyOrder {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int oderId;
	
	@Column
	private String orderBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderRegisterTime;

	@OneToMany(fetch = FetchType.LAZY,mappedBy="myOrder")
	private List<MyOderAndProduct> list;
	
	
	public List<MyOderAndProduct> getList() {
		return list;
	}

	public void setList(List<MyOderAndProduct> list) {
		this.list = list;
	}

	public int getOderId() {
		return oderId;
	}

	public void setOderId(int oderId) {
		this.oderId = oderId;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Date getOrderRegisterTime() {
		return orderRegisterTime;
	}

	public void setOrderRegisterTime(Date orderRegisterTime) {
		this.orderRegisterTime = orderRegisterTime;
	}

	public MyOrder(int oderId, String orderBy, Date orderRegisterTime) {
		super();
		this.oderId = oderId;
		this.orderBy = orderBy;
		this.orderRegisterTime = orderRegisterTime;
	}

	public MyOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyOrder [oderId=" + oderId + ", orderBy=" + orderBy + ", orderRegisterTime=" + orderRegisterTime
				+  "]";
	}
	
	
	
}
