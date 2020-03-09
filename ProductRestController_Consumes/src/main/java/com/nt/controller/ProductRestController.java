package com.nt.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.nt.model.Product;

@Path("/product")
public class ProductRestController {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String ShowProduct(Product p) {
		return p.toString();
	}

}
