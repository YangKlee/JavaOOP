/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 8 thg 1, 2025
*/ 
package DAO;
import model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.*;
import references.SQLCommand;
public class DAOExpCandidate implements DAOInterface<ExpCandidate>, SQLCommand {

	public static DAOExpCandidate get()
	{
		return new DAOExpCandidate();
	}
	boolean isSuccess = false;
	@Override
	public boolean insertDB(ExpCandidate t) {
		JDBC jdbc = new JDBC();
		Connection con = jdbc.getConnection();
		java.sql.Date sqlDate = null;
		try {
			
			PreparedStatement preStm = con.prepareStatement(addExpCandidateCommand);
			preStm.setString(1, t.getHoTen());
			sqlDate = new java.sql.Date(t.getNgaySinh().getTime());
			
			preStm.setDate(2, sqlDate);
			preStm.setString(3, t.getDiaChi());
			preStm.setString(4, t.getQueQuan());
			preStm.setString(5, t.getSoDT());
			preStm.setString(6, t.getEmail());
			preStm.setFloat(7, (float)t.getNamKN());
			preStm.setString(8, t.getKyNang());
			preStm.setString(9, t.getNoiLamViecLast());
			preStm.execute();
			isSuccess = true;
		} catch (SQLException e) {
			isSuccess = false;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			jdbc.closeConnection(con);
			return isSuccess;
		}
	}

}
