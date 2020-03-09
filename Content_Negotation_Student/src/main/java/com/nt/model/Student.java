package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private int sid;
	private String pname;
	private String pcode;
	public Student() {
		
	}
	public Student(int sid, String pname, String pcode) {
		super();
		this.sid = sid;
		this.pname = pname;
		this.pcode = pcode;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", pname=" + pname + ", pcode=" + pcode + "]";
	}
	

}
