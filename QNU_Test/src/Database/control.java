/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 12, 2024
*/ 
package Database;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import classQNU.SinhVien;
public class control {

	static Connection conn =  null;
	public control() throws ClassNotFoundException {
		this.conn = JDBC.getConnection();
	}
	public static Statement taoKetNoi () throws SQLException
	{
		Statement st = conn.createStatement();
		return st;
	}
	public static void themSV_DB(SinhVien sv) throws SQLException
	{
		String query = "EXEC themSV N'<first_name>', N'<last_name>', <gennder>, '<address>'";
		query = query.replaceAll("<first_name>", sv.getFirstName());
		query = query.replaceAll("<last_name>", sv.getLastName());
		query = query.replaceAll("<gennder>", (sv.getGioiTinh()).toString());
		query = query.replaceAll("<address>", sv.getDiaChi());
		System.out.println(query);
		taoKetNoi().execute(query);
	}
	public static ArrayList<SinhVien> laySV_DB() throws SQLException
	{
		ArrayList<SinhVien> dsSVD = new ArrayList<SinhVien>();
		ResultSet result = null;
		result =  taoKetNoi().executeQuery("Select * from SinhVien");
		
		while (result.next()) {
				SinhVien tmp = new SinhVien();
				tmp.setMaSV(result.getInt(1));
				tmp.setLastName(result.getNString(2));
				tmp.setFirstName(result.getNString(3));
				tmp.setGioiTinh(result.getBoolean(4));
				tmp.setDiaChi(result.getNString(5));
				//System.out.println(tmp.toString()); 
				dsSVD.add(tmp);
		}
		return dsSVD;
		
	}
	
	
	
}
