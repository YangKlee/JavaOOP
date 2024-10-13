/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 1 thg 10, 2024
*/ 
package overloadconstuctor;

public class test {
	public static void main(String[] args) {
		Student st1 = new Student("4651050044", "Nguyễn Khánh Dương", "18/07/2005");
		// Student(String MaSV, String HoTen, int NienKhoa,String Khoa, String NgaySinh , float DiemTrungBinh)
		Student st2 = new Student("111111111", "Nguyễn Phương Quỳnh Hương", 
				46,"Ngon Ngu Anh", "06/09/2005", 9.6f);
		st1.display();
		st2.display();
	}
}
