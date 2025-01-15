/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 1, 2025
*/ 
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.JDBCUntil;
import model.ExamStudent;
import references.SQLCommand;

public class DAOExamStudents implements DAOInterface<ExamStudent>, SQLCommand {

	public static DAOExamStudents get()
	{
		return new DAOExamStudents();
	}
	@Override
	public boolean addToDB(ExamStudent t) {
		JDBCUntil jdbc = new JDBCUntil();
		Connection c = jdbc.getConnection();
		try {
			PreparedStatement preStm = c.prepareStatement(addExStudent);
			preStm.setString(1, t.getHoTen());
			preStm.setDate(2, new java.sql.Date(t.getNgaySinh().getTime()));
			preStm.setString(3, t.getGioiTinh());
			preStm.setString(4, t.getDiaChi());
			preStm.setString(5, t.getQueQuan());
			preStm.setString(6, t.getSoDT());
			preStm.setString(7, t.getEmail());
			preStm.setDate(8, new java.sql.Date(t.getNgayThiTuyen().getTime()));
			preStm.setDouble(9, t.getTongDiem());
			preStm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
			
		}
		finally {
			jdbc.closeConnection(c);
		}
		
	}
	
}
