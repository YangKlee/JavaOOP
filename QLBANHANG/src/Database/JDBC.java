/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	Connection conn = null;
	
	private void createConnection()
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String urlConnection = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QLBANHANG;"
					+ ";user=YangKlee;password=18072005;encrypt=true;trustServerCertificate=true";
			conn = DriverManager.getConnection(urlConnection);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public Statement createStatement()
	{
		Statement stm = null;
		createConnection();
		if (!conn.equals(null))
		{
			try {
				stm = conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Kết nối không thành công");
			closeConnection();
		}
		return stm;
	}
	public void closeConnection()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
