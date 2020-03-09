package com.nt.integrationLayer;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.nt.model.Student;
import com.nt.service.StudentService;


@Path("/student")
public class StudentRestController {
	@Inject
	private StudentService service;
	@POST
	@Consumes("application/json")
	public Response save(Student s) {
		Response rs=null;
		try {
			int count=service.save(s);
			if(count==1) {
				rs=Response.ok("SUCCESSFULLY CREATED").build();
			}
				else {
					rs=Response.ok()
							.entity("PROBLEM FOUND")
							.status(Status.BAD_REQUEST)
							.build();
				}
			
			
		} catch (Exception e) {
			   rs=Response.ok()
					   .entity(e.getMessage())
					   .status(Status.INTERNAL_SERVER_ERROR)
					   .build();
			e.printStackTrace();
		}
		return rs;
	}
	

}
