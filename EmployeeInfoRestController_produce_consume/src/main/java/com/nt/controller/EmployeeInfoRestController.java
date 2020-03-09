package com.nt.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.Employee;
import com.nt.model.SalaryInfo;

@Path("/emp")
public class EmployeeInfoRestController {
	@POST
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public SalaryInfo showsalarydetial(Employee e) {
		double basic=e.getBasicSal();
		double hra=5*basic/100.0;
		double ta=2*basic/100.0;
		double da=3*basic/100.0;
		double tax=6*basic/100.0;
		double net=basic+hra+ta+da-tax;
		SalaryInfo in=new SalaryInfo();
		in.setEname(e.getEname());
		in.setBasic(basic);
		in.setHra(hra);
		in.setTa(ta);
		in.setDa(da);
		in.setTax(tax);
		in.setNet(net);
		return in;
		
		
	}

}
