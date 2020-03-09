package com.nt.model;

public class Customer {
	private int cid;
	private String cname;
	private double bill;
	private Address addr;
	public Customer() {
		System.out.println("Customer.Customer()");
	}
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
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", bill=" + bill + ", addr=" + addr + "]";
	}
  

}
