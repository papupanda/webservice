package com.nt.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.nt.model.Customer;

@Path("/customer")
public class CustomerRestController {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String readCustomer(Customer c) {
		return c.toString();
	}

}
