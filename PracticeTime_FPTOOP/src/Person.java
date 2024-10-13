/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 1 thg 10, 2024
*/

public class Person {
	private int id;
	private String candidateName;
	private String gender;
	private String birthDate;
	private String email;
	
	public Person(int id, String candidateName, String gender, String birthDate, String email)
	{
		this.id = id;
		this.candidateName = candidateName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.email = email;
	}
	// get method
	public int getId()
	{
		return this.id;
	}
	public String getCandidateName()
	{
		return this.candidateName;
	}
	public String getGender()
	{
		return this.gender;
	}
	public String getBirth()
	{
		return this.birthDate;
	}
	public String getEmail()
	{
		return this.email;
	}
}
