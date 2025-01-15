/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 8 thg 1, 2025
*/ 
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBC {
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=employee;"
					+ ";user=YangKlee;password=18072005;encrypt=true;trustServerCertificate=true";
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(Connection con)
	{
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
