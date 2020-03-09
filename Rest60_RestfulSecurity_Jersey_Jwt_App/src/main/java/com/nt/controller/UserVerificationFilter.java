package com.nt.controller;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.nt.config.JwtUtil;


public class UserVerificationFilter implements ContainerRequestFilter {

	@Context
	private ResourceInfo info;
	@Context
	private HttpHeaders header;
	@Override
	public void filter(ContainerRequestContext req) throws IOException {
		Method m=info.getResourceMethod();
		if(m.isAnnotationPresent(TokenRequired.class)) {
			List<String> list=header.getRequestHeader("Authorization");
			if(list==null||list.isEmpty()) {
				req.abortWith(Response.status(Status.BAD_REQUEST)
						.entity("No Authorization provided")
						.build());
				return;
			}
			try {
				String token=list.get(0);
				JwtUtil.validate(token);
			}
			catch (Exception e) {
				req.abortWith(Response.status(Status.UNAUTHORIZED).entity(e.getMessage())
						.build());
				e.printStackTrace();
				return;
			}
		}

	}

}
