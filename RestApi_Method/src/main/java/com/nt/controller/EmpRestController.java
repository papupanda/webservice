package com.nt.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/employee")
public class EmpRestController {
	@POST
	public String SaveEmployee() {
		return "From Save Emp";
	}
	@GET
	public String FetchEmployee() {
		return "Fetch Emp";
	}
	@DELETE
	public String removeEmployee() {
		return "From Delete";
	}
	@PUT
	public String ModifyEmployee() {
		return "From Modify";
	}

}
