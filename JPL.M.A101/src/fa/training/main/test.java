/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package fa.training.main;
import java.util.ArrayList;
import java.util.Date;

import fa.training.entities.*;
import fa.training.services.*;
public class test {
	public static void main(String[] args) {
		
		
		Thread writeFile = new threadReadFile();
		listCandidate.add(new ExperienceCandidate("Nguyen Khanh", "Duong", 
				new Date(2005, 07, 18), "Quy Nhon" , "0356701052" ,
				"abc@gmail.com", 3, "FrontEnd"));
		writeFile.start();
		System.out.println((listCandidate.get(0)).toString());
		
	}
}
