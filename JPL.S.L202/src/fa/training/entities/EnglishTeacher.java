/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 5 thg 10, 2024
*/ 
package fa.training.entities;

public class EnglishTeacher extends Teacher implements Actionable{
	private String mainSubject;
	public EnglishTeacher() {}
	public EnglishTeacher(String designation, String collegeName, String mainSubject)
	{
		super(designation, collegeName);
		this.mainSubject = mainSubject;
	}
	public String getMainSubject()
	{
		return this.mainSubject;
	}
	public int sum(int a, int b)
	{
		return a+b;
	}
	public void setMainSubject(String mainSubject)
	{
		this.mainSubject = mainSubject;
	}
	@Override
	public void Teach()
	{
		System.out.println("English Teacher is teaching ... ");
	}
	public String toString()
	{
		String s = "" + this.designation +" " + this.collegeName +" "
				+ this.mainSubject;
		return s;
	}
	@Override
	public void toSchool() {
		 System.out.println("English teacher go to school by motorbike"); 
	}
	public String translate(String en, String vi) {
		return en + " in Vietnamese " + vi;
	}
}
