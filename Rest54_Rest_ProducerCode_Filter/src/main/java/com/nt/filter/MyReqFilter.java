package com.nt.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

public class MyReqFilter implements ContainerRequestFilter {

	public void filter(ContainerRequestContext req) throws IOException {
		
    System.out.println("from req filter");
	}

}
