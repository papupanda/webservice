package com.nt.controller;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/paytm")
public class PaymentRestController {

	@GET
	@PermitAll
	@Path("/all")
	public String showAll() {
	return "Welcome to All";	
	}
	
	@GET
	@DenyAll
	@Path("/none")
	public String showNone() {
		return "Not a Full Impl ";
	}
	@GET
	@RolesAllowed("ADMIN")
	@Path("/admin")
	public String showAdmin() {
		return "Welcome to Admin";
	}
	@GET
	@RolesAllowed({"ADMIN","CUST"})
	@Path("/ven")
	public String showVendor() {
		return "Welcome to Vendor";
	}
}
