package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertQueryThroughPrepared {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
		//Statement stmt = con.createStatement();
		PreparedStatement pstmt = con.prepareStatement("insert into employee(id,name,salary) values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, salary);
		int res = pstmt.executeUpdate();
		if(res>0) {
			System.out.println("Record inserted successfully...");
		}
		//int res = stmt.executeUpdate("insert into employee values(1,'Ravi',16000)");
				} catch (Exception e) {
			System.out.println(e);		
			}

	}

}
