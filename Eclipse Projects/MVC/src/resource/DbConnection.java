package resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getDbConnection() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
		return con;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error in Resource "+e);
		}
		return null;
	}
}
