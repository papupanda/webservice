package com.nt.model;

public class Employee {
	private int eid;
	private String dept;
	private String branch;
	
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", dept=" + dept + ", branch=" + branch + "]";
	}
	
	

}
