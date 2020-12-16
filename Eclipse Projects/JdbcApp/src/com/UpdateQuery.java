package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
			Statement stmt = con.createStatement();
	int result = stmt.executeUpdate("update employee set salary = salary+500 where id = 4");
			if(result>0) {
			System.out.println("Record updated successfully..");
			}else {
				System.out.println("Record is not present");
			}
		stmt.close();
		con.close();
		} catch (Exception e) {
			System.out.println(e);		
			}

	}

}
