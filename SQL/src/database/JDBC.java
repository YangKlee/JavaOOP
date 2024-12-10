/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 26 thg 11, 2024
*/ 
package database;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;



public class JDBC {
	public static Connection getConnection() throws ClassNotFoundException {
		Connection c = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QNU;"
					+ ";user=YangKlee;password=18072005;encrypt=true;trustServerCertificate=true";
			c = DriverManager.getConnection(url);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return c;
	}
	public static void closeConnection(Connection c)
	{
		try {
			if (c != null)
				c.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
