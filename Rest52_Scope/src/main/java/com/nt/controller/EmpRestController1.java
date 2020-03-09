package com.nt.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Singleton
@Path("emp1")
public class EmpRestController1 {
	public EmpRestController1() {
		System.out.println("obj is created");
	}
	@GET
	public String Show() {
		return "Hi";
	}

}
