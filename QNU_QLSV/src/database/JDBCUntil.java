/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUntil {
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=SVQNU;"
					+ ";user=YangKlee;password=18072005;encrypt=true;trustServerCertificate=true";
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			
			con = DriverManager.getConnection(url);
			System.out.println("Create connect successfully!!");
		} catch (SQLException e) {
			System.out.println("Create connect error!!");
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(Connection con)
	{
		try {
			if (con != null)
				con.close();
			System.out.println("Close connect successfully!");
		} catch (SQLException e) {
			System.out.println("Close connect error!!");
			e.printStackTrace();
		}
	}
}
