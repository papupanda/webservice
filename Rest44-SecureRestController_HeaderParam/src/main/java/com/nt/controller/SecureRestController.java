package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("secure")
public class SecureRestController {
	@GET
	public String verifyAndProcess(
	@HeaderParam("clientid")String id,
	@HeaderParam("securecode")String code) {
	String message=null;
	//null or empty validation 
		if(id==null||"".equals(id.trim())) {
			message="Empty Client Id Provided";
		}
		else if(code==null||"".equals(code.trim())) {
			message="Empty SecureCode Provided";
		}
		else if("123".equals(id)&&"abc".equalsIgnoreCase(code)) {
			message="welcome to Amazon Client";
		}
		else {
			message="Un-Authorized Client";
		}
		return message;
	}

}
