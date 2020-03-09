package com.nt.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Consumer1;

@Path("/con")
public class CustomerRestController {
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Consumer1 showCustomer() {
		Consumer1 c=new Consumer1();
		c.setCid(10);
		c.setCname("satya");
		c.setType("sdd");
		return c;
		
	}

}
