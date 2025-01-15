/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 1, 2025
*/ 
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUntil;
import model.SinhVien;
import references.SQLCommand;

public class DAOSinhVien implements DAOInterface<SinhVien>, SQLCommand {

	public static DAOSinhVien get()
	{
		return new DAOSinhVien();
	}
	@Override
	public boolean addToDB(SinhVien t) {
		JDBCUntil jdbc = new JDBCUntil();
		Connection c = jdbc.getConnection();
		try {
			PreparedStatement preStm = c.prepareStatement(addSVSQL);
			preStm.setString(1, t.getMaSV());
			
			preStm.setString(2, t.getHoTen());
			preStm.setDate(3, new java.sql.Date(t.getNgaySinh().getTime()));
			preStm.setString(4, t.getDiaChi());
			preStm.setString(5, t.getSoDT());
			preStm.setString(6, t.getEmail());
			preStm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			jdbc.closeConnection(c);
		}
		return true;
	}

	@Override
	public boolean updateByID(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByID(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SinhVien getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SinhVien> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<SinhVien> selectWithCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
