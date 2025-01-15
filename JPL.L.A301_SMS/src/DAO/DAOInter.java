/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 1, 2025
*/ 
package DAO;

import java.util.ArrayList;

public interface DAOInter<T> {
	public void addToDB(T t);
	public ArrayList<T> getAll();
	public ArrayList<T> getWithCondition(String condition);
}
