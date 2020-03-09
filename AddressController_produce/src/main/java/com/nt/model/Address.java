package com.nt.model;

public class Address {
	private String hno;
	private String ioc;
	public Address() {
		
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getIoc() {
		return ioc;
	}
	public void setIoc(String ioc) {
		this.ioc = ioc;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", ioc=" + ioc + "]";
	}
	

}
