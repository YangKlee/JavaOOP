/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 27 thg 11, 2024
*/ 
package program;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;

import Database.JDBC;
import Database.control;
import classQNU.*;
public class QuanLy {
	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		Diem dm = new Diem(1, 1, 1);
		SinhVien sv1 = new SinhVien(1, "Khang", "Buồi Ngọc", true, "Quy Nhơn", dm);
		control con = new control();
		con.themSV_DB(sv1);
		ArrayList<SinhVien> ds = new ArrayList<>(control.laySV_DB());
		for (int i = 0; i < ds.size(); i++)
		{
			System.out.println((ds.get(i)).toString());

		}
		
	}
}
