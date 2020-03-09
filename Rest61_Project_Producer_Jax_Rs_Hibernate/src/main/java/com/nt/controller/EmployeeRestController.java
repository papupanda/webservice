package com.nt.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.nt.model.Employee;
import com.nt.resp.ErrorResponse;
import com.nt.service.IEmployeeService;
import com.sun.org.apache.bcel.internal.generic.NEW;

@Path("/emp")
public class EmployeeRestController {
	@Inject
	private IEmployeeService service;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/get")
	public Response showEmployee() {
		Response res=null;
		try {
			List<Employee> list=service.getAllEmployee();
			if(list==null||list.isEmpty()) {
				//resp=Response.status(204).build(); 
				res=Response.status(Status.NO_CONTENT)
						.entity(new ErrorResponse("NO DATA","NO RECORD FOUND AT PRODUCER"))
						.build();
			}
			else {
				res=Response.status(Status.OK).
						entity(list).
						build();
			}
		}
		catch (Exception e) {
			res=Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity(e.getMessage())
					.build();
		}
		return res;
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/saveemp")
	public Response saveEmployee(Employee e) {
		Response res=null;
		try {
			Integer id=service.saveEmployee(e);
			res=Response.status(Status.OK).entity(new StringBuffer()
					                                .append("SAVED WITH ID")
					                                .append(id)
					                                .toString())
					                                .build();
			
		}
		catch (Exception e1) {
			res=Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity(e1.getMessage())
					.build();
			e1.printStackTrace();
		}
		return res;
	}
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/delete")
	public Response deleteEmployee(
			@QueryParam("id")Integer id) {
		Response res=null;
		try {
		service.deleteEmployee(id);
		res=Response.status(Status.OK).entity(new StringBuffer()
				                                   .append("Delete")
				                                   .toString())
				                                    .build();
	}
		catch (Exception e) {
			res=Response.status(Status.INTERNAL_SERVER_ERROR)
					.entity(e.getMessage())
					.build();
			e.printStackTrace();
		}
		return res;
	}
	

}
