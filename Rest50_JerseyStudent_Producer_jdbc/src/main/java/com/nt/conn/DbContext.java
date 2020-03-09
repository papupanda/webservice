package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbContext {
	private static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","satya");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getconn() {
		return con;
	}

}
