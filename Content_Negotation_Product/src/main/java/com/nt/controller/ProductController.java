package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Product;
@Path("/product")
public class ProductController {
	@GET
	@Path("/view")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Product showproduct() {
		return new Product(10, "saa", "455_4");
	}

}
