/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 1 thg 10, 2024
*/ 
package staticFieldExample;

public class Student {
	int rollno;
	String name;
	static String college;
	static {
		college	= "ITS";
		System.out.println("Static Block");
	}
	Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
		System.out.println("Constuctor Block");
	}
	void display()
	{
		System.out.println(this.rollno + " "+ this.name + " "+ this.college);
	}
	static void changeCollege()
	{
		college = "FU";
	}
}
