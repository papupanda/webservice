package com.nt.model;

import java.util.List;
import java.util.Map;

public class Student {
	private int sid;
	private String sname;
	private List<String> subject;
	Map<String,Integer>mark;
	private Address ads;
	public Address getAds() {
		return ads;
	}
	public void setAds(Address ads) {
		this.ads = ads;
	}
	public Student() {
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Map<String, Integer> getMark() {
		return mark;
	}
	public void setMark(Map<String, Integer> mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", subject=" + subject + ", mark=" + mark + ", ads=" + ads
				+ "]";
	}
	
  

}
