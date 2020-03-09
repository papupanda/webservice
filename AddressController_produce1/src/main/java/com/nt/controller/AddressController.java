package com.nt.controller;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Address;

@Path("/address")
public class AddressController {
	@GET
	@Path("/data")
	public void show() {
		System.out.println("from service");
	}
	@GET
	@Path("/view")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> showList(){
		return Arrays.asList("A","B","C");
	}
	
}
