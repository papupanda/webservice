package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/emp")
public class EmpController {

	@GET
	public String show() {
		System.out.println("from producer");
		return "hello";
	}
}
