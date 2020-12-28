package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Login;
import resource.DbConnection;

public class LoginDao {

	public boolean checkUser(Login ll) {
		try {
	Connection con = DbConnection.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement("select * from login where username like ? and password like ?");
	pstmt.setString(1, ll.getUser());
	pstmt.setString(2, ll.getPass());
	
	ResultSet rs = pstmt.executeQuery();
	System.out.println(ll.getUser()+" "+ll.getPass());
	if(rs.next()) {
		System.out.println("True");
		return true;
	}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return false;
	}
}
