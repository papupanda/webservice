package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.hk2.api.Immediate;

@Path("/emp3")
@Immediate
public class EmpRestController3 {
	public EmpRestController3() {
		System.out.println("Emp Object Created");
	}
	@GET
	public String getData() {
		return "hello";
	}

}
