package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Consumer1 {
	private  int cid;
	private String cname;
	private String type;
	public Consumer1() {
		
	}
	public Consumer1(int cid, String cname, String type) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.type = type;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Consumer [cid=" + cid + ", cname=" + cname + ", type=" + type + "]";
	}
	
	

}
