package com.nt.model;

public class Student {
	private Integer sid;
	private String sname;
	private double fee;
	private String course;
	private double discount;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fee=" + fee + ", course=" + course + ", discount="
				+ discount + "]";
	}
	
	

}
