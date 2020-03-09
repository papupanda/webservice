package com.nt.controller;

import java.time.LocalDate;
import java.time.Period;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/age")
public class AgeCalculatorRestController {
	@GET
	public String getAge(@QueryParam("years")int years,
			@QueryParam("months")int months,
			@QueryParam("days")int days
			) {
		
		 // date of birth
        LocalDate pdate = LocalDate.of(years, months, days);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
		//return value
        return diff.getYears()+ " Years " +diff.getMonths()+ " months " +diff.getDays()+ " days " ;
	}

}
