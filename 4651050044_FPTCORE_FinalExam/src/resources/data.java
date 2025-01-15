/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package resources;

import java.util.ArrayList;

import model.Student;
import model.errorData;

public interface data {
	public static ArrayList<Student> listStudents = new ArrayList<Student>();
	public static ArrayList<errorData> errorDatas = new ArrayList<errorData>();
}
