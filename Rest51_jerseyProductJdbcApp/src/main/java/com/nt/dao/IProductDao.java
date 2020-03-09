package com.nt.dao;

import java.util.List;

import com.nt.model.Product2;


public interface IProductDao {

	public int saveProduct(Product2 p);
	public List<Product2> getAllProduct();
	
}
