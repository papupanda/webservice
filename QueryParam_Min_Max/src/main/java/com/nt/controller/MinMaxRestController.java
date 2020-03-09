package com.nt.controller;

import java.util.DoubleSummaryStatistics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
@Path("/minmax")
public class MinMaxRestController {
	@GET
	public String findminmax(
			@QueryParam("numa") int a,
			@QueryParam("numb") int b,
			@QueryParam("numc") int c) 
	{
		/*int max=a>b?(a>c?a:c):(b>c?b:c);
		int min=a<b?(a<c?a:c):(b<c?b:c);*/
		/*int max=Math.max(Math.max(a, b),c);
		int min=Math.min(Math.min(a, b),c);
		return "min..."+min+"....max..."+max;*/
		DoubleSummaryStatistics ds=new DoubleSummaryStatistics();
		ds.accept(a);
		ds.accept(b);
		ds.accept(c);
		double max=ds.getMax();
		double min=ds.getMin();
		return new StringBuilder()
				.append("Result is:")
				.append("min="+min)
				.append("max="+max)
				.toString();
		
	}

}
