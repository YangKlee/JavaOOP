/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.JDBC;
import model.InternCandidate;
import references.SQLCommand;

public class DAOInternCandidate implements DAOInterface<InternCandidate>, SQLCommand {

	public static DAOInternCandidate get()
	{
		return new DAOInternCandidate();
	}
	boolean isSuccess = false;
	@Override
	public boolean insertDB(InternCandidate t) {
		JDBC jdbc = new JDBC();
		Connection con = jdbc.getConnection();
		java.sql.Date sqlDate = null;
		try {
			
			PreparedStatement preStm = con.prepareStatement(addInternCandidateCommand);
			preStm.setString(1, t.getHoTen());
			sqlDate = new java.sql.Date(t.getNgaySinh().getTime());
			preStm.setDate(2, sqlDate);
			preStm.setString(3, t.getDiaChi());
			preStm.setString(4, t.getQueQuan());
			preStm.setString(5, t.getSoDT());
			preStm.setString(6, t.getEmail());
			preStm.setString(7, t.getChuyenNganhHoc());
			preStm.setInt(8, t.getHocKyDangHoc());
			preStm.setString(9, t.getTruongHoc());
			sqlDate = new java.sql.Date(t.getNgayTotNghiep().getTime());
			preStm.setDate(10, sqlDate);
			isSuccess = preStm.execute();
			isSuccess = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isSuccess = false;
		}
		finally {
			jdbc.closeConnection(con);
			return isSuccess;
		}
		
	}
	
}
