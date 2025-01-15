/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package program;

import model.Student;
import services.DataServices;
import services.FileServices;

public class CommandProgram {
	public static void main(String[] args) {
		FileServices fsv= new FileServices();
		fsv.readFile("src/file/input.txt");
		
		DataServices dataServices = new DataServices();
		dataServices.exportDB();
		System.out.println("Debug export file: \n");
		dataServices.exportError("src/file/output.txt");
	}
}
