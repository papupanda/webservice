package com.nt.controller;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/exp")
public class ExpressionRestController {
	@GET
	public String getval(
			@QueryParam("input")String input) {
		String result=null;
		try {
			ScriptEngineManager sm=new ScriptEngineManager();
			ScriptEngine se=sm.getEngineByName("javascript");
			Object ob=se.eval(input);
			result=ob.toString();
		} catch (Exception e) {
			result="invalid Exception";
			e.printStackTrace();
		}
		return result;
	}

}
