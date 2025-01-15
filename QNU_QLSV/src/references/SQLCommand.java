/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package references;

public interface SQLCommand {
	public String addSVSQL = "insert into Students "
			+ "values(?,?,?,?,?,?)";
	public String addHPSQL = "insert into HocPhan values(?,?,?)";
	
	
}
