package com.nt.model;

import java.util.List;
import java.util.Map;

public class Student {
	private int sid;
	private String sname;
	private double sfee;
	List <String>subject;
	Map<String,Integer> marks;
	public Student() {
		System.out.println("Student.Student()");
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
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", subject=" + subject + ", marks="
				+ marks + "]";
	}
	

}
