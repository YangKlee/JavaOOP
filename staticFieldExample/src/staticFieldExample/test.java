/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 1 thg 10, 2024
*/ 
package staticFieldExample;

public class test {
	public static void main(String args[]) {
		//Student.changeCollege();
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		Student s3 = new Student(2122, "Klee");
		s1.display();
		s2.display();
		s3.display();
		Student.changeCollege();
		s1.display();
		s2.display();
		s3.display();
		
	}
}
