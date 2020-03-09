package com.nt.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import com.nt.dao.IProductDao;
import com.nt.model.Product2;

public class ProductServiceImpl implements IProductService {
	@Inject
	private IProductDao dao;

	@Override
	public int saveProduct(Product2 p) {
		int count=0;
		//read prodcost
		double cost=p.getProdCost();
		//calculate discount and gst
		double discount=cost*8/100.0;
		double gst=cost*18/100.0;
		//set back to model class
		p.setProdDisc(discount);
		p.setProdGst(gst);
		//use dao 
		count=dao.saveProduct(p);
		
		return count;
	}
	@Override
	public List<Product2> getAllProduct() {
		List<Product2> list=dao.getAllProduct();
		//sort using comparator
		Collections.sort(list,(o1,o2)->o1.getProdId()-o2.getProdId());
		return list;
	}

}
