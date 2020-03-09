package com.nt.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.nt.service.IEmpService;

@Path("/emp")
public class EmployeeRestController {
	@Inject
	private IEmpService service;
	@GET
	public String getData() {
		return "hello"+service.getdata();
	}

}
