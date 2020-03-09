package com.nt.model;

public class Product {
	private int pid;
	private String pcode;
	private double pamt;
	private Info in;
	public Product() {
		
	}
	public Product(int pid, String pcode, double pamt, Info in) {
		super();
		this.pid = pid;
		this.pcode = pcode;
		this.pamt = pamt;
		this.in = in;
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
	public double getPamt() {
		return pamt;
	}
	public void setPamt(double pamt) {
		this.pamt = pamt;
	}
	public Info getIn() {
		return in;
	}
	public void setIn(Info in) {
		this.in = in;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcode=" + pcode + ", pamt=" + pamt + ", in=" + in + "]";
	}
	

}
