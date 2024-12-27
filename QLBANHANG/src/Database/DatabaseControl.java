/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package Database;

import java.sql.SQLException;
import java.sql.Statement;

import entity.SanPham;

public class DatabaseControl {
	JDBC dbconn = new JDBC();
	Statement stm = dbconn.createStatement();
	public void themSP(String maSP,SanPham sp)
	{
		String strQuery = "Insert into SanPham \n"
				+ "values('<masp>', N'<tensp>', <soluong>, <giaban>)";
		strQuery = strQuery.replaceAll("<masp>", maSP);
		strQuery = strQuery.replaceAll("<tensp>", sp.getTenSP());
		strQuery = strQuery.replaceAll("<soluong>", String.valueOf(sp.getSoLuong()));
		strQuery = strQuery.replaceAll("<giaban>", String.valueOf(sp.getGiaBan()));
		System.out.println(strQuery);
		try {
			if (!stm.execute(strQuery))
			{
				System.out.println("Thêm thành công");
			}
			else
			{
				System.out.println("Éo đc");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
