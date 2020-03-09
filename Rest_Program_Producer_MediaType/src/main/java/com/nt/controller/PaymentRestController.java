package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Payment;

@Path("/payment")
public class PaymentRestController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Payment ShowInfo() {
		Payment p=new Payment();
		p.setPid(10);
		p.setPcode("MM");
		p.setPamt(1.5);
		return p;
	}

}
