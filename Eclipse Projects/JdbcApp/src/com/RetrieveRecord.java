package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
			Statement stmt = con.createStatement();
			ResultSet rs  = stmt.executeQuery("select * from employee");
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float salary = rs.getFloat(3);
				System.out.println("id is "+id+" name is "+name+" salary is "+salary);
			}
			rs.close();
		stmt.close();
		con.close();
		} catch (Exception e) {
			System.out.println(e);		
			}

	}

}
