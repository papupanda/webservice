package com.nt.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/card")
public class CardRestController {
	@POST
	public String Card(
			@FormParam("cname")String custName,
			@FormParam("cnum")String cardNum,
			@FormParam("cvv")String cvv,
			@FormParam("amt")double amt,
			@FormParam("dte")String txDate)
			{
		return new StringBuilder()
				.append("Name:").append(custName)
				.append("Number:").append(cardNum)
				.append("cvv:").append(cvv)
				.append("amt:").append(amt)
				.append("dte").append(txDate).toString();
		
	}

}
