package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
@Path("/emp")
public class EmpRestController {
	@GET
	@Path("/data/{id}/{name}/{sal}")
	public String showmsg(
			@PathParam("id")int eid,
			@PathParam("name")String name,
			@PathParam("sal")double salary)
	{
		return "hello:"+eid+","+name+","+salary;
		
	}

}
