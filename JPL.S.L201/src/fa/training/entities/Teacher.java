/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 2 thg 10, 2024
*/ 
package fa.training.entities;

public abstract class Teacher {
	 String designation;
	protected String collegeName;
	
	public Teacher() {};
	public Teacher(String designation, String collegeName)
	{
		super();
		this.designation = designation;
		this.collegeName = collegeName;
	}
	public String getDesignation()
	{
		return this.designation;
	}
	public String getCollegeName()
	{
		return this.designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public void getCollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
	public abstract void Teach();
}
