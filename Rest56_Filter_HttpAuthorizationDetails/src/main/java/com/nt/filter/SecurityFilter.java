package com.nt.filter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


public class SecurityFilter implements ContainerRequestFilter {
    @Context
	private HttpHeaders header;
    @Context
    private ResourceInfo info;
	public void filter(ContainerRequestContext req) throws IOException {
		System.out.println("---------from filter----------");
		System.out.println(info.getResourceClass());
		System.out.println(info.getResourceMethod());
		//current request java method details
		Method m=info.getResourceMethod();
		System.out.println("permitAll->"+m.isAnnotationPresent(PermitAll.class));
		System.out.println("denyAll->"+m.isAnnotationPresent(DenyAll.class));
		System.out.println("RolesAllowed->"+m.isAnnotationPresent(RolesAllowed.class));
		//read value
		List<String> list=header.getRequestHeader("Authorization");
		String auth=list.get(0);
		System.out.println("header param::"+auth);
		//remove basic space from auth string
		auth=auth.replaceAll("Basic", "");
		//Decode using jdk8-Base64
		byte[] arr=Base64.getDecoder().decode(auth);
		auth=new String(arr);
		System.out.println("After Decode"+auth);
		//read user and password using split method
		String[] autharr=auth.split(":");
		String user=autharr[0];
		String password=autharr[1];
		System.out.println("user"+user);
		System.out.println("password"+password);
		
		
		//------------------------------------
		Method m1=info.getResourceMethod();
		if(m.isAnnotationPresent(RolesAllowed.class)) {
			//read method leavel role
			String[] arr1=m1.getAnnotation(RolesAllowed.class).value();
			System.out.println(Arrays.asList(arr1));
		}
		else {
			System.out.println("May be permitAll/DenetAll");
		}
		req.abortWith(Response.status(Status.BAD_REQUEST)
				.entity("No Auth Found")
		         .build()) ;
		return;
		
	}

}
