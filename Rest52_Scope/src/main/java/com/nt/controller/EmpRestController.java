package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.process.internal.RequestScoped;

@Path("/emp")
@RequestScoped
public class EmpRestController {
	public EmpRestController() {
		System.out.println("obj is created");
	}
	@GET
	public String show() {
		return "Hi";
	}

}
