package com.nt.controller;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/prod")
public class ProductRestController {

	@GET
	@Path("/all")
	@PermitAll
	public String viewAll() {
		return "Welcome to All";
	}
	@GET
	@Path("/none")
	@DenyAll
	public String viewnone() {
		return "Wlcome to none";
	}
	@GET
	@Path("/admin")
	@RolesAllowed("ADMIN")
	public String viewAdmin() {
		return "welcome to admin";
	}
	@GET
	@Path("/msg")
	@RolesAllowed({"ADMIN","CUST"})
	public String viewpersion() {
		return "welcome to admin/customer";
	}
}
