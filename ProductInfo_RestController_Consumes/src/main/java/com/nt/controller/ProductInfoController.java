package com.nt.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.nt.model.Product;

@Path("/product")
public class ProductInfoController {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String showProduct(Product p) {
		return p.toString();
	}

}
