package com.nt.model;




public class Employee{
	
	private Integer empid;
	private String empName;
	private Double empsal;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(Double empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empsal=" + empsal + "]";
	}
	

}
