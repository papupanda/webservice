package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_rest")
public class Employee implements Comparable<Employee>{
	@Id
	@Column(name = "eid")
	@GeneratedValue
	private Integer empid;
	@Column(name = "ename")
	private String empName;
	@Column(name = "esal")
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
	@Override
	public int compareTo(Employee e) {
		
		return this.getEmpid()-e.getEmpid();
	}
	

}
