package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/papu")
public class Controller {
	@GET
	public String m1() {
		return "hello";
	}

}
