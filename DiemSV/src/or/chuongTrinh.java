/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 20 thg 11, 2024
*/ 
package or;

import java.util.ArrayList;

public class chuongTrinh {
	public static void main(String[] args) {
		ArrayList<SinhVien> dsSV = new ArrayList<>(3);
		//SinhVien sv1 = new SinhVien("Nguyen Khanh Duong",2, 9.2f , 9.3f, 5.0f );
		dsSV.add(new SinhVien("Nguyen Khanh Duong", "Toan", 2 ,9.2f , 9.3f, 5.0f) );
		dsSV.add(new SinhVien("Nguyen Khanh Duong", "Toan", 2 ,9.2f , 9.3f, 5.0f) );
		//dsSV.add(new SinhVien("Nguyen Khanh Duong", "Toan", 2 ,9.2f , 9.3f, 5.0f) );
		
	}
	
}
