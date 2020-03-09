package com.nt.controller;

import java.util.Random;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/token")
public class TokenRestController {
	@GET
	public String getToken(@QueryParam("type")String type,
			@QueryParam("size")int size) {
		String result=null;
		if(size<=0) {
			result="invalid size";
		}//if
		else if("otp".equals(type)) {
			Random r=new Random();
			while(true) {
				//fix max number range
				int maxrange=(int) (Math.pow(10, size)-1);
				//generate random number
				int c=r.nextInt(maxrange);
				//convert -ve to +ve
				c=Math.abs(c);
				//convert int to string
				result=String.valueOf(c);
				if(result.length()==size) {
					break;
				}//if
			}//while
		}//else if
			else if("captcha".equals(type)) {
				result=UUID.randomUUID().toString()
						.replaceAll("-"," ").toUpperCase()
						.substring(0,size);
			}//else if
	
		/*
		 * else { result="Invalid Type"; }
		 */

		return result;

		
	}//method

}//class
