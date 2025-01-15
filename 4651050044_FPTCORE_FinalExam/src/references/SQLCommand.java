/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package references;

public interface SQLCommand {
	public static String addExStudent = "exec procExamStudent ?,?,?,?,?,?,?,?,?";
	public static String addDirStudent = "exec procDirectStudent ?,?,?,?,?,?,?,?,?,?,?";
}
