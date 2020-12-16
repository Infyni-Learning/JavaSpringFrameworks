package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) {
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded successfully....");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
		System.out.println("Established the connection successfully...");
		Statement stmt = con.createStatement();
		System.out.println("Statement created successfully...");
		int result = stmt.executeUpdate("insert into employee values(2,'Ramesh',14000)");
		if(result>0) {
			System.out.println("Record inserted successfully....");
		}
		stmt.close();
		con.close();
		} catch (Exception e) {
			System.out.println(e);		
			}
	}

}
