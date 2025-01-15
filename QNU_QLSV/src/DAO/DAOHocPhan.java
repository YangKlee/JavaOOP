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
import model.HocPhan;
import references.SQLCommand;

public class DAOHocPhan implements DAOInterface<HocPhan>, SQLCommand {

	public static DAOHocPhan get()
	{
		return new DAOHocPhan();
	}
	@Override
	public boolean addToDB(HocPhan t) {
		JDBCUntil jdbc = new JDBCUntil();
		Connection c = jdbc.getConnection();
		try {
			PreparedStatement preStm =  c.prepareStatement(addHPSQL);
			preStm.setString(1, t.getMaHP());
			preStm.setString(2, t.getLoaiHP());
			preStm.setString(3, t.getTenHP());
			preStm.execute();
		} catch (SQLException e) {
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
	public HocPhan getByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HocPhan> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HocPhan> selectWithCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
