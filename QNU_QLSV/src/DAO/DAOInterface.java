/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package DAO;

import java.util.ArrayList;

public interface DAOInterface<T> {
	public boolean addToDB(T t);
	public boolean updateByID(String id);
	public boolean deleteByID(String id);
	public T getByID(String id);
	public ArrayList<T> selectAll();
	public ArrayList<T> selectWithCondition(String condition);
		
}
