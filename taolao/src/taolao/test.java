/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 23 thg 10, 2024
*/ 
package taolao;

public class test {
	public static void main(String[] args) {
		Person p1 = new Person("Duong", 167.3f, 77);
		Person p2 = new Person("Cuong", 187.3f, 77);
		Person p3 = new Person("Cuong cu dai", 123.3f);
		p1.hienThi();
		//System.out.println(p1.getName());
		p1.setName("Duong dep trai");
		//System.out.println(p1.getName());
		p3.hienThi();
	}
}
