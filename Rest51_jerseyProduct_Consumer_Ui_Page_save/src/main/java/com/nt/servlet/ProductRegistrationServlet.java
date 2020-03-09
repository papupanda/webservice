package com.nt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.consumer.ProductRestConsumer;

import ccom.nt.model.Product2;

@WebServlet("/save")
public class ProductRegistrationServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//read from data 
				String pid=req.getParameter("pid");
				String pcode=req.getParameter("pcode");
				String pcost=req.getParameter("pcost");
				//type casting
				int prodId=Integer.parseInt(pid);
				Double prodCost=Double.parseDouble(pcost);
				//convert to model class object
				Product2 p=new Product2();
				p.setProdId(prodId);
				p.setProdCode(pcode);
				p.setProdCost(prodCost);
				//call consumer code
				String entity=ProductRestConsumer.saveProduct(p);
				//set request attribute
				req.setAttribute("message", entity);
				//forword using requstDispatcher
				RequestDispatcher rd=req.getRequestDispatcher("ProductRegister.jsp");
				rd.forward(req, res);
				
	}

}
