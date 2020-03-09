package com.nt.model;

public class Invoice {
	private int txid;
	private double billAmt;
	private String discount;
	private Gst g;
	public Invoice() {
		
	}
	public Invoice(int txid, double billAmt, String discount, Gst g) {
		super();
		this.txid = txid;
		this.billAmt = billAmt;
		this.discount = discount;
		this.g = g;
	}
	public int getTxid() {
		return txid;
	}
	public void setTxid(int txid) {
		this.txid = txid;
	}
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public Gst getG() {
		return g;
	}
	public void setG(Gst g) {
		this.g = g;
	}
	@Override
	public String toString() {
		return "Invoice [txid=" + txid + ", billAmt=" + billAmt + ", discount=" + discount + ", g=" + g + "]";
	}
	

}
