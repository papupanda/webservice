package com.nt.model;

public class Address {
	private int aid;
	private double ioc;
	public Address() {
		System.out.println("Address.Address()");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public double getIoc() {
		return ioc;
	}
	public void setIoc(double ioc) {
		this.ioc = ioc;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", ioc=" + ioc + "]";
	}
	

}
