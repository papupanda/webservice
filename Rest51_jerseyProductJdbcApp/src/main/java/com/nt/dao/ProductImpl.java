package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.nt.context.DbContext;
import com.nt.model.Product2;

public class ProductImpl implements IProductDao {
	private static final String sql_insert="insert into product2 values(?,?,?,?,?)";
    private static final String Sql_select="select * from product2";
	@Override
	public int saveProduct(Product2 p) {
		int count=0;
		try {
			Connection con=DbContext.getCon();
			PreparedStatement ps=con.prepareStatement(sql_insert);
			//convert model object to ps
			ps.setInt(1,p.getProdId());
			ps.setString(2, p.getProdCode());
			ps.setDouble(3, p.getProdCost());
			ps.setDouble(4, p.getProdDisc());
			ps.setDouble(5, p.getProdGst());
			//execute sql query
			count=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	/*
	 * Fetch All data 
	 */
	@Override
	public List<Product2> getAllProduct() {
		List<Product2> list=new ArrayList<>();
		
		try {
			//get connection
			Connection con=DbContext.getCon();
			//create statement
			PreparedStatement ps=con.prepareStatement(Sql_select);
			//execute query
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				//create object
				Product2 p=new Product2();
				p.setProdId(rs.getInt("prodId"));
				p.setProdCode(rs.getString("prodCode"));
				p.setProdCost(rs.getDouble("prodCost"));
				p.setProdDisc(rs.getDouble("prodDisc"));
				p.setProdGst(rs.getDouble("prodGst"));
				//add list 
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
