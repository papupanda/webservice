package com.nt.model;

public class Gst {
	private int cgst;
	private String sgts;
	public Gst() {
		
	}
	public Gst(int cgst, String sgts) {
		super();
		this.cgst = cgst;
		this.sgts = sgts;
	}
	public int getCgst() {
		return cgst;
	}
	public void setCgst(int cgst) {
		this.cgst = cgst;
	}
	public String getSgts() {
		return sgts;
	}
	public void setSgts(String sgts) {
		this.sgts = sgts;
	}
	@Override
	public String toString() {
		return "Gst [cgst=" + cgst + ", sgts=" + sgts + "]";
	}
	

}
