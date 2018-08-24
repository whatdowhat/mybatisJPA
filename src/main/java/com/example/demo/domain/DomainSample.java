package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class DomainSample {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name = "name", nullable=false, length=10)
	private String userName;
	
	@Enumerated(EnumType.STRING)
	private RoleType roletype;


	@Temporal(TemporalType.TIMESTAMP)
	private Date registrate;
	
	@Lob
	private byte[] lobByte;

	





	public byte[] getLobByte() {
		return lobByte;
	}

	public void setLobByte(byte[] lobByte) {
		this.lobByte = lobByte;
	}

	public Date getRegistrate() {
		return registrate;
	}

	public void setRegistrate(Date registrate) {
		this.registrate = registrate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public RoleType getRoletype() {
		return roletype;
	}

	public void setRoletype(RoleType roletype) {
		this.roletype = roletype;
	}


	public enum RoleType{
		ADMIN,
		USER
	}


	@Override
	public String toString() {
		return "DomainSample [id=" + id + ", userName=" + userName + ", roletype=" + roletype + ", registrate="
				+ registrate + ", getRegistrate()=" + getRegistrate() + ", getId()=" + getId() + ", getUserName()="
				+ getUserName() + ", getRoletype()=" + getRoletype() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}




}