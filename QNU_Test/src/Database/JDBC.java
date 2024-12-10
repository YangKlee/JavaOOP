/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 27 thg 11, 2024
*/ 
package Database;
import java.sql.*;
public class JDBC {
	public static Connection getConnection() throws ClassNotFoundException
	{
		Connection conn = null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver")  ;
		String urlConnection = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QNU;"
				+ ";user=YangKlee;password=18072005;encrypt=true;trustServerCertificate=true";
		try
		{
			conn = DriverManager.getConnection(urlConnection);
		}
		catch (SQLException e)
		{
			Exception SQLCONNECTERROR = new Exception("Loi khong the ket noi");
		}
		return conn;
	}
	public static void closeConnection(Connection conn) throws SQLException
	{
		conn.close();
	}
}
