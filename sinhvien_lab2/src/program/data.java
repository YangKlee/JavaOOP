/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package program;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

import entity.SV;

public interface data {
	public static ArrayList<SV> dsSV = new ArrayList<SV>();
	String pattern = "dd/MM/yyyy";
	SimpleDateFormat simpleDay =  new SimpleDateFormat(pattern);
}
