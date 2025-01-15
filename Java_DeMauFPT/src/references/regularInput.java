/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package references;

public interface regularInput {
	public static String Email = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+$";
	public static String Phone = "^[0-9]{7,}$";
	public static String birthDay = "^[0-9]{4}/[0-9]{2}/[0-9]{2}$";
	public static String expYear = "^[0-9]+(\\.[0-9])?$";
}
