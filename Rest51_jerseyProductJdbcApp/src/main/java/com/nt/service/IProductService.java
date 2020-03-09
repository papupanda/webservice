package com.nt.service;

import java.util.List;

import com.nt.model.Product2;

public interface IProductService {
	public int saveProduct(Product2 p);
	public List<Product2> getAllProduct();
}
