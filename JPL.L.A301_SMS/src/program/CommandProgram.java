/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package program;

import DAO.DAOCustomer;
import model.Customer;

public class CommandProgram {
	public static void main(String[] args) {
		//Customer cs = new Customer(4, "Yang");
		//DAOCustomer.getDaoCustomer().addToDB(cs);
		for (Customer c : DAOCustomer.getDaoCustomer().getAll())
		{
			System.out.println(c.toString());
		}
		
	}
}
