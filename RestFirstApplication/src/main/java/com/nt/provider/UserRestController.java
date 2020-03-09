package com.nt.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/user")
public class UserRestController {
	@GET
	@Path("/view")
 public String FetchData() {
	 return "Hello";
 }
}
