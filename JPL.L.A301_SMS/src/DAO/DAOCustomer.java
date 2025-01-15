/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 1, 2025
*/ 
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUntil;
import model.Customer;

public class DAOCustomer implements DAOInter<Customer> {

	public static DAOCustomer getDaoCustomer()
	{
		return new DAOCustomer();
	}
	@Override
	public void addToDB(Customer t) {
		JDBCUntil jdbc = new JDBCUntil();
		Connection c = jdbc.getConnection();
		String sql = "insert into Customer values(?,?)";
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, t.getCustomerId());
			ps.setString(2, t.getCustomerName());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public ArrayList<Customer> getAll() {
		ArrayList<Customer> ee = new ArrayList<Customer>();
		JDBCUntil jdbc = new JDBCUntil();
		Connection c = jdbc.getConnection();
		String sql = "select * from Customer";
		try {
			PreparedStatement psm = c.prepareStatement(sql);
			ResultSet data = psm.executeQuery();
			while (data.next())
			{
				Customer cus = new Customer(data.getInt(1), data.getString(2));
				ee.add(cus);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return ee;
	}

	@Override
	public ArrayList<Customer> getWithCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
