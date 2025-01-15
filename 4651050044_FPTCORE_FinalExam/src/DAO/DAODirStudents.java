/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 1, 2025
*/ 
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.JDBCUntil;
import model.DirectStudent;
import references.SQLCommand;

public class DAODirStudents implements DAOInterface<DirectStudent>, SQLCommand {

	public static DAODirStudents get()
	{
		return new DAODirStudents();
	}
	@Override
	public boolean addToDB(DirectStudent t) {
		JDBCUntil jdbc = new JDBCUntil();
		Connection c = jdbc.getConnection();
		try {
			PreparedStatement preStm = c.prepareStatement(addDirStudent);
			preStm.setString(1, t.getHoTen());
			preStm.setDate(2, new java.sql.Date(t.getNgaySinh().getTime()));
			preStm.setString(3, t.getGioiTinh());
			preStm.setString(4, t.getDiaChi());
			preStm.setString(5, t.getQueQuan());
			preStm.setString(6, t.getSoDT());
			preStm.setString(7, t.getEmail());
			preStm.setString(8, t.getCapDoGiaiThuong());
			preStm.setString(9, t.getTenGiai());
			preStm.setInt(10, t.getNamDatGiai());
			preStm.setString(11, t.getXepLoaiGiai());
			preStm.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		finally {
			jdbc.closeConnection(c);
			
		}
	}

}
