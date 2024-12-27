/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package map;

import java.util.HashMap;

public class test {
	public static void main(String[] args) {
		HashMap<String, String> tuDien = new HashMap<String, String>();
		tuDien.put("Among", "Giữa chúng ta");
		tuDien.put("Nahida", "Thảo thần");
		tuDien.put("Anyone", "Mọi người");
		tuDien.put("Anyone", "Mọi người");
		tuDien.replace("Nahida", "Vợ tui");
		System.out.println(tuDien.get("Nahida"));
	}
}
