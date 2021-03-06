package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Product;

@Path("/pp")
public class ProductController {
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Product showProduct() {
		return new Product(10,"PEN",6.6);
	}

}
