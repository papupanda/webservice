package com.nt.controller;

import java.util.StringTokenizer;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.codec.binary.Base64;

@Path("/secure")
public class SecureRestController {
	@GET
	public Response validate(
			@HeaderParam("Authorization")String auth) {
		Response resp=null;
		System.out.println(auth);
		//auth is null or empty
		if(auth==null||"".equals(auth.trim())) {
			return Response.ok()
					.status(Status.BAD_REQUEST)
					.entity("No Auth provided")
					.build();
		}
		//remove basic <space>
		auth=auth.replaceAll("Basic", "");
		System.out.println(auth);
		//decode Auth
		byte[] arr=Base64.decodeBase64(auth.getBytes());
		auth=new String(arr);
		System.out.println(auth);
		//tokenize auth
		StringTokenizer str=new StringTokenizer(auth,":");
		String un=str.nextToken();
		String pwd=str.nextToken();
		//validate
		if(!("admin".equals(un)&&"nit".equals(pwd))) {
			return Response.ok()
					.entity("invalid un/pwd provided")
					.status(Status.UNAUTHORIZED)
					.build();
		}
		resp=Response.ok("welcome to App").build();
		return resp;
	}

}
