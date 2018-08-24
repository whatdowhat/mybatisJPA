package com.example.demo.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class MyProduct {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	
	@Column
	private String productName;
	
	@Column
	private int produectQuantity;
	
	@Column
	private BigDecimal produectPrice;

	@OneToMany(fetch = FetchType.LAZY,mappedBy="myProduct")
	private List<MyOderAndProduct> list;
	
	public List<MyOderAndProduct> getList() {
		return list;
	}

	public void setList(List<MyOderAndProduct> list) {
		this.list = list;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProduectQuantity() {
		return produectQuantity;
	}

	public void setProduectQuantity(int produectQuantity) {
		this.produectQuantity = produectQuantity;
	}

	public BigDecimal getProduectPrice() {
		return produectPrice;
	}

	public void setProduectPrice(BigDecimal produectPrice) {
		this.produectPrice = produectPrice;
	}

	public MyProduct(int productId, String productName, int produectQuantity, BigDecimal produectPrice) {
		super();
		productId = productId;
		this.productName = productName;
		this.produectQuantity = produectQuantity;
		this.produectPrice = produectPrice;
	}

	public MyProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyProduct [ProductId=" + productId + ", productName=" + productName + ", produectQuantity="
				+ produectQuantity + ", produectPrice=" + produectPrice + "]";
	}
	
	
	
	
	
}
