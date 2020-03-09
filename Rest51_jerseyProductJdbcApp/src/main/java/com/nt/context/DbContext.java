package com.nt.context;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * this code is used to create db
 * connection using singleton
 * design pattern
 * */
 
public class DbContext {
	private static Connection con=null;
	/*
	 * static block execute once
	 */
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","satya");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	/*
	 * method is used read connection
	 * outside
	 */
	public static Connection getCon() {
		return con;
	}

}
