package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Employee;
@Path("/emp")
public class EmployeeRestController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee ShowEmpInfo() {
	Employee e=new Employee();
      e.setEid(10);
      e.setEname("satya");
      e.setEsal(1000.0);
      return e;
	}

}
