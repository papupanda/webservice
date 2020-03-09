package com.nt.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.nt.model.Product2;
import com.nt.service.IProductService;

@Path("/product")
public class ProductController {
	@Inject
	private IProductService service;
	@POST
	@Path("/insert")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response SaveProduct(Product2 p) {
		Response rs=null;
		int count=0;
		try {
			//call service method
			count=service.saveProduct(p);
			if(count==1) {
				rs=Response.ok("SUCESSFULLY CREATED").build();
			}
			else {
				rs=Response.ok()
						.status(Status.BAD_REQUEST)
						.entity("NOT CREATED").build();
			}
			
		} catch (Exception e) {
			rs=Response.ok()
					.status(Status.INTERNAL_SERVER_ERROR)
					.entity(e.getMessage()).build();
			e.printStackTrace();
		}
		return rs;
	}
	@GET
	@Path("/allget")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Product2> getAllProduct(){
		//call service method
		List<Product2> list=service.getAllProduct();
		return list;
	}

}
