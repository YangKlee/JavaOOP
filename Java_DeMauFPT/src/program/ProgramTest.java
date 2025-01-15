/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 8 thg 1, 2025
*/ 
package program;

import services.DataServices;
import services.FileServices;

public class ProgramTest {
	public static void main(String[] args) {
		FileServices f = new FileServices();
		DataServices dat = new DataServices();
		f.readFile("src/file/input.txt");
		dat.exportError("src/file/output.txt");
		dat.exportToDB();
	}
}
