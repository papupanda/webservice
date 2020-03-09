package com.nt.model;

public class Customer {
	private int cid;
	private String code;
	private String addrs;
	private Invoice i;
	private Gst g;
	public Customer() {
		
	}
	
	public Gst getG() {
		return g;
	}

	public void setG(Gst g) {
		this.g = g;
	}

	public Customer(int cid, String code, String addrs, Invoice i, Gst g) {
		super();
		this.cid = cid;
		this.code = code;
		this.addrs = addrs;
		this.i = i;
		this.g = g;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Invoice getI() {
		return i;
	}
	public void setI(Invoice i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", code=" + code + ", addrs=" + addrs + ", i=" + i + ", g=" + g + "]";
	}
	
	

}
