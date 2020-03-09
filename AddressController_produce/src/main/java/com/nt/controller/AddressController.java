package com.nt.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Address;
import com.nt.model.Student;

@Path("/address")
public class AddressController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getsid() {
		Address  a=new Address();
		Map m=new HashMap();
		a.setHno("766-33");
		a.setIoc("hdg");
		Student s=new Student();
		s.setSid(1);
		s.setSname("satya");
		s.setSubject(Arrays.asList("A","B","C"));
		m.put("satya", 1);
		m.put("kk", 2);
		s.setMark(m);
        s.setAds(a);
        return s;
		
	}

}
