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

public class SecureFilter implements ContainerRequestFilter {
    @Context
	private ResourceInfo info;
	@Context
	private HttpHeaders header;
	public void filter(ContainerRequestContext req) throws IOException {
		Method method=info.getResourceMethod();
		if(!method.isAnnotationPresent(PermitAll.class)) {    
			if(method.isAnnotationPresent(DenyAll.class)) {     
				req.abortWith(
						Response.status(Status.FORBIDDEN)       
						.entity("You can not access this service")       
						.build()      
						);     
				return;    
				}//Deny all end 
		
		if(method.isAnnotationPresent(RolesAllowed.class)) {
			List<String> list=header.getRequestHeader("Authorization");
			//if auth is null or is empty
			if(list==null||list.isEmpty()) {
				req.abortWith(
						Response.status(Status.BAD_REQUEST)
						.entity("No Authorization Details Found")
						.build()
						);
				return;
			}
			//if auth is not empty or null;
			String auth=list.get(0);
			String user=null;
			String pwd=null;
			try {
				//replace all
				auth=auth.replaceAll("Basic ", "");
				//decode
				byte[] arr=Base64.getDecoder().decode(auth);
				auth=new String(arr);
				//split un/pwd
				String[] sec=auth.split(":");
				user=sec[0];
				pwd=sec[1];
				System.out.println("___God Work____");
				System.out.println(user);
				System.out.println(pwd);
				
			}
			catch(Exception e) {
				e.printStackTrace();
				req.abortWith(
						Response.status(Status.INTERNAL_SERVER_ERROR)
						.entity("Unable to user/pwd authorization head")
						.build()
						);
				return;
			}//catch end
			//validate user
			boolean flag=validateUser(user, pwd);
			if(!flag) {//not a valid user
				req.abortWith(
						Response.status(Status.UNAUTHORIZED)
						.entity("User/password is invalid")
					    .build()
						);
				return;
			}
			//validate roles
			String[] rolesArray=method.getAnnotation(RolesAllowed.class).value();
			List<String> rolesAtMethod=Arrays.asList(rolesArray);
			flag=validateRole(user, rolesAtMethod);
			if(!flag) {
				req.abortWith(
						Response.status(Status.FORBIDDEN)
						.entity("User has invalid")
						.build()
						);
				return;
			}
		}
		}

	}
	private  boolean validateUser(String user,String pwd) {
		boolean flag=false;
		if("sam".equals(user)&& "nit".equals(pwd)) {
			flag=true;
		}
	else if("khan".equals(user) && "xyz".equals(pwd)) {   
		//khan-xyz-ADMIN,CUST    
		flag=true; 
	}
	else if("ram".equals(user)&& "sita".equals(pwd)) {
		flag=true;
	}
			
		return flag;
	}
	private boolean validateRole(String user,List<String> rolesAtMethod) {
		boolean flag=false;
		if("sam".equals(user) && rolesAtMethod.contains("ADMIN")) {    
			flag=true;   
			}else if("khan".equals(user) && (rolesAtMethod.contains("ADMIN")|| rolesAtMethod.contains("CUST")      
					)    
					)   
			{   
				//khan-xyz-ADMIN,CUST    
				flag=true;   
				}else if("ram".equals(user) && rolesAtMethod.contains("CUST")) {    
					//ram-abc-CUST    
					flag=true;   
					  
			
		}
	return flag; 
	
	
}
}



