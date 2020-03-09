package com.nt.model;

public class Info {
	private String bcode;
	private String batchnum;
	private String lotnum;
	public Info() {
		
	}
	public Info(String bcode, String batchnum, String lotnum) {
		super();
		this.bcode = bcode;
		this.batchnum = batchnum;
		this.lotnum = lotnum;
	}
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getBatchnum() {
		return batchnum;
	}
	public void setBatchnum(String batchnum) {
		this.batchnum = batchnum;
	}
	public String getLotnum() {
		return lotnum;
	}
	public void setLotnum(String lotnum) {
		this.lotnum = lotnum;
	}
	@Override
	public String toString() {
		return "Info [bcode=" + bcode + ", batchnum=" + batchnum + ", lotnum=" + lotnum + "]";
	}
	

}
