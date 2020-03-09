package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.nt.conn.DbContext;
import com.nt.model.Student;

public class StudentDaoImpl implements StudentDao {

	public int saveStudent(Student s) {
		int i=0;
		try {
			String Sql="INSERT INTO STUDENT_REST VALUES(?,?,?,?,?)";
			Connection con=DbContext.getconn();
			PreparedStatement ps=con.prepareStatement(Sql);
			ps.setInt(1, s.getSid());
			ps.setString(2, s.getSname());
			ps.setDouble(3, s.getFee());
			ps.setString(4, s.getCourse());
			ps.setDouble(5, s.getDiscount());
			i=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

}
