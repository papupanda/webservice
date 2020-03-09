package com.nt.model;

public class Product {
	private int pid;
	private String pcode;
	private String pname;
	public Product() {
		
	}
	public Product(int pid, String pcode, String pname) {
		super();
		this.pid = pid;
		this.pcode = pcode;
		this.pname = pname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + ", pname=" + pname + "]";
	}
	

}
