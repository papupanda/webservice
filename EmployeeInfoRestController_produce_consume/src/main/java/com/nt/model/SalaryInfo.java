package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SalaryInfo {
	private String ename;
	private double basic;
	private double hra;
	private double ta;
	private double da;
	private double tax;
	private double net;
	public SalaryInfo() {
		
	}
	public SalaryInfo(String ename, double basic, double hra, double ta, double da, double tax, double net) {
		super();
		this.ename = ename;
		this.basic = basic;
		this.hra = hra;
		this.ta = ta;
		this.da = da;
		this.tax = tax;
		this.net = net;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getNet() {
		return net;
	}
	public void setNet(double net) {
		this.net = net;
	}
	@Override
	public String toString() {
		return "SalaryInfo [ename=" + ename + ", basic=" + basic + ", hra=" + hra + ", ta=" + ta + ", da=" + da
				+ ", tax=" + tax + ", net=" + net + "]";
	}
	
	

}
