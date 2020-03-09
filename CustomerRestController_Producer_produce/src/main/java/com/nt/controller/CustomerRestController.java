package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Address;
import com.nt.model.Customer;

@Path("/customer")
public class CustomerRestController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Customer FindData() {
	Address ad=new Address();
	ad.setAid(1);
	ad.setIoc(1.77);
	Customer c=new Customer();
	c.setCid(2);
	c.setCname("aa");
	c.setBill(1.866);
	c.setAddr(ad);
	return c;
	}

}
