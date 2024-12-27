/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package interfaceEx;

import java.util.HashMap;
import java.util.Map;

public interface data {
	static Map <Integer, String> sinhVien = new HashMap<Integer, String>();
	
	default void inData()
	{
		System.out.println(sinhVien);
	}
}
