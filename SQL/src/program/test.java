/*
	Autho`r: YangKlee - Nguyen Khanh Duong
	Date: 26 thg 11, 2024
*/ 
package program;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBC;

public class test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Connection conn = JDBC.getConnection();
		Statement st = conn.createStatement();
		String sql = "insert into SinhVien(last_name, first_name, gender, address)"
				+ "values (N'Tuấn Cường', N'Trần Thanh', 1, N'Quy Nhơn, Bình Định')";
		//st.execute(sql);
		String sql1 = "DELETE SinhVien where last_name Like N'%Tuấn Cường%'";
		int num = st.executeUpdate(sql1);
		System.out.println("Update " + num);
		ResultSet query = null;
		query = st.executeQuery("SELECT first_name, last_name from SinhVien");
		while (query.next())
		{
			System.out.println(query.getNString(1)+ " " + query.getNString(2));
		}
		System.out.println(conn);
		JDBC.closeConnection(conn);
	}
}
