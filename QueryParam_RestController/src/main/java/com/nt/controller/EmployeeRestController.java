package com.nt.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/emp")
public class EmployeeRestController {
	@GET
 public String getEmployee(@QueryParam("empid") int eid,@QueryParam("empDept")String dept,@QueryParam("branch")String branch) {
		return new StringBuilder("Employee:")
				.append("ID:").append(eid)
				.append("Dept:").append(dept)
				.append("branch:").append(branch)
				.toString();
	 
 }
}
