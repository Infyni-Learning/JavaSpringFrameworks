package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository				//DAO layer specific annotation 
public class EmployeeDao {

	@Autowired
	DataSource ds;
		public void displayDetails() {
			try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+"Salary is "+rs.getFloat(3));
			}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
}
