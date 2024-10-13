/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 1 thg 10, 2024
*/

public class Interviewer extends Person{
	private int experience;
	public Interviewer(int id, String candidateName, String gender, 
			String birthDate, String email, int experience)
	{
		super(id, candidateName, gender, birthDate, email);
		this.experience = experience;
	}
	// get method
	public int getExperience()
	{
		return this.experience;
	}
}
