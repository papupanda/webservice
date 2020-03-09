package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class BillInfo {
	private int purchaseid;
	private String code;
	private double cost;
	private double qnty;
	private double discount;
	private double price;
	public BillInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BillInfo(int purchaseid, String code, double cost, double qnty, double discount, double price) {
		super();
		this.purchaseid = purchaseid;
		this.code = code;
		this.cost = cost;
		this.qnty = qnty;
		this.discount = discount;
		this.price = price;
	}
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
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
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BillInfo [purchaseid=" + purchaseid + ", code=" + code + ", cost=" + cost + ", qnty=" + qnty
				+ ", discount=" + discount + ", price=" + price + "]";
	}
	

}
