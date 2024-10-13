/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 2 thg 10, 2024
*/ 
package fa.training.entities;

public class MathTeacher extends Teacher{
	private String mainSubject;
	public MathTeacher() {}
	public MathTeacher(String designation, String collegeName, String mainSubject)
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
		System.out.println("Math Teacher is teaching ... ");
	}
	public String toString()
	{
		String s = "" + this.designation +" " + this.collegeName +" "
				+ this.mainSubject;
		return s;
	}
}
