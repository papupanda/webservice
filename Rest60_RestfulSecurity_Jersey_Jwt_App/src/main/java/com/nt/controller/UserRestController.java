package com.nt.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.nt.config.JwtUtil;

@Path("/user")
public class UserRestController {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/validate")
	public Response validateClient(
			@FormParam("user")String un,
			@FormParam("password")String pwd)
	{
		UserToken ut=null;
		int status=0;
		if("sam".equals(un)&&"nit".equals(pwd)) {
			ut=new UserToken("USER VERIFIED",JwtUtil.generate("125", "sam"));
			status=200;
		}
		else {
			ut=new UserToken("INVAILD USER/PWD PROVIDED","NO TOKEN PROVIDED");
			status=401;
		}
		return Response
				.status(status)
				.entity(ut)
				.build();
		
	}
	@POST
	@TokenRequired
	@Path("/admin")
	public String ProvideService() {
		return "welcome to Auth user";
	}

}
