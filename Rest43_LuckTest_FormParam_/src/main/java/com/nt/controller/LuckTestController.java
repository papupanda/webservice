package com.nt.controller;

import java.util.Random;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/luck")
public class LuckTestController {
	@POST
	public String getMsg(@FormParam("num")int num) {
		String msg=null;
		int rand=new Random().nextInt(9);
		if(rand==num) {
			msg="Congrats Win 1 lack";
		}
		else {
			msg="Try Again";
		}
		return msg;

	}
	
}
