package com.java.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class contacts {
	@Id
	private int cid;
	private String cname;
	private String cnumber1;
	private String cnumber2;
	private String email;
	private String address;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCnumber1() {
		return cnumber1;
	}
	public void setCnumber1(String cnumber1) {
		this.cnumber1 = cnumber1;
	}
	public String getCnumber2() {
		return cnumber2;
	}
	public void setCnumber2(String cnumber2) {
		this.cnumber2 = cnumber2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "contact [cid=" + cid + ", cname=" + cname + ", cnumber1=" + cnumber1 + ", cnumber2=" + cnumber2
				+ ", email=" + email + ", address=" + address + "]";
	}
	

}
