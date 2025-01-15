/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package program;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;

import entity.SV;

public class test implements data{
	public static void main(String[] args) throws ParseException {
		dsSV.add(new SV("Trịnh Trần Phương Tuấn", simpleDay.parse("07/09/1997"), 5.3));
		dsSV.add(new SV("Nguyễn Khánh Dương", simpleDay.parse("18/07/2005"), 9.3));
		dsSV.add(new SV("Nguyễn Yến Nhi", simpleDay.parse("17/02/2005"), 8.3));
		dsSV.add(new SV("Đỗ Phú Quý", simpleDay.parse("07/09/1977"), 5.3));
		dsSV.add(new SV("Nguyễn Phương Quỳnh Hương", simpleDay.parse("17/09/2008"), 7.3));
		
	}
}
