package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class ItemDetails {
	private int taxid;
	private String code;
	private double cost;
	private double qnty;
	public ItemDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemDetails(int taxid, String code, double cost, double qnty) {
		super();
		this.taxid = taxid;
		this.code = code;
		this.cost = cost;
		this.qnty = qnty;
	}

	public int getTaxid() {
		return taxid;
	}
	public void setTaxid(int taxid) {
		this.taxid = taxid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getQnty() {
		return qnty;
	}
	public void setQnty(double qnty) {
		this.qnty = qnty;
	}

	@Override
	public String toString() {
		return "ItemDetails [taxid=" + taxid + ", code=" + code + ", cost=" + cost + ", qnty=" + qnty + "]";
	}
	
	

}
