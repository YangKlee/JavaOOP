/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 2 thg 10, 2024
*/ 
package fa.training.management;
import fa.training.entities.MathTeacher;
public class TeacherManagement {
	public static void main(String[] args) {
		MathTeacher teacher = new MathTeacher("Nahida", "Sumeru", "Math");
		//MathTeacher MathTeach1 = new MathTeacher("Klee", "Monstand", "Toan roi rac");
		System.out.println(teacher);
		teacher.Teach();
		System.out.println("Tổng = " + teacher.sum(15, 5));
	}
}
