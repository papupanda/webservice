package com.nt.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Student;

@Path("/student")
public class StudentRestController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student ShowStudent() {
		Student s=new Student();
		Map a=new HashMap();
		a.put("sita", 1);
		a.put("rama",2);
		s.setSid(10);
		s.setSname("satya");
		s.setSfee(1.5);
		s.setSubject(Arrays.asList("A","B","C"));
		s.setMarks(a);
		return s;
	}

}
