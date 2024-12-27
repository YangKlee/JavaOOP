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
		ArrayList<SinhVien> dsdv = new ArrayList<>();
		dsdv.add(new SinhVien(1, "Nhi", "Nguyễn Yến", true, "Quy Nhơn", dm));
		dsdv.add(new SinhVien(2, "Nhi", "Nguyễn Lê", true, "Quy Nhơn", dm));
		dsdv.add(new SinhVien(3, "Lê", "Nguyễn Yến", true, "Quy Nhơn", dm));
		dsdv.add(new SinhVien(4, "Dương", "Nguyễn Khánh", false, "Quy Nhơn", dm));
		control con = new control();
		for (int i = 0; i < dsdv.size(); i++)
		{
			con.themSV_DB(dsdv.get(i));
		}
		
		ArrayList<SinhVien> ds = new ArrayList<>(control.laySV_DB());
		for (int i = 0; i < ds.size(); i++)
		{
			System.out.println((ds.get(i)).toString());

		}
		
	}
}
