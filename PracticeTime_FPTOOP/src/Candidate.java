/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 1 thg 10, 2024
*/

public class Candidate extends Person {
	private double gpa;
	public Candidate(int id, String candidateName, String gender, 
			String birthDate, String email, double gpa )
	{
		super(id, candidateName, gender, birthDate, email);
		this.gpa = gpa;
	}
	// get method
	public double getGpa()
	{
		return this.gpa;
	}
}
