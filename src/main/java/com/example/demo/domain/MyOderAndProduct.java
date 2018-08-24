package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class MyOderAndProduct {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int myOrderAndProductId;
	
	
	@ManyToOne
	@JoinColumn(name="oderId")	
	private MyOrder myOrder;
	
	@ManyToOne
	@JoinColumn(name="ProductId")	
	private MyProduct myProduct;

	public int getMyOrderAndProductId() {
		return myOrderAndProductId;
	}

	public void setMyOrderAndProductId(int myOrderAndProductId) {
		this.myOrderAndProductId = myOrderAndProductId;
	}

	public MyOrder getMyOrder() {
		return myOrder;
	}

	public void setMyOrder(MyOrder myOrder) {
		this.myOrder = myOrder;
	}

	public MyProduct getMyProduct() {
		return myProduct;
	}

	public void setMyProduct(MyProduct myProduct) {
		this.myProduct = myProduct;
	}

	public MyOderAndProduct(int myOrderAndProductId, MyOrder myOrder, MyProduct myProduct) {
		super();
		this.myOrderAndProductId = myOrderAndProductId;
		this.myOrder = myOrder;
		this.myProduct = myProduct;
	}

	public MyOderAndProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyOderAndProduct [myOrderAndProductId=" + myOrderAndProductId + ", myOrder=" + myOrder + ", myProduct="
				+ myProduct+ "]";
	}
	
	
	
	
}
