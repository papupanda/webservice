package com.nt.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nt.model.BillInfo;
import com.nt.model.ItemDetails;

@Path("/item")
public class ItemBillRestController {
	@POST
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public BillInfo ShowDetail(ItemDetails it) {
		double dcost=it.getCost();
		double discount=dcost*5/100;
		double QNTY=it.getQnty();
		double bprice=QNTY*(dcost-discount);
		BillInfo bi=new BillInfo();
		bi.setPurchaseid(it.getTaxid());
		bi.setCode(it.getCode());
		bi.setCost(dcost);
		bi.setQnty(QNTY);
		bi.setDiscount(discount);
		bi.setPrice(bprice);
		
	return bi;	
	}

}
