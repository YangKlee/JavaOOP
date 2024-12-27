/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package fa.training.entities;

import java.io.Serializable;
import java.util.Date;

public class ExperienceCandidate extends Candidate implements Serializable {
	int yearExperience;
	String professionalSkill;
	public ExperienceCandidate(String firstName, String lastName, Date birthDay, String address, String phone,
			String email, int yearExperience, String professionalSkill) {
		super(firstName, lastName, birthDay, address, phone, email);
		this.yearExperience = yearExperience;
		this.professionalSkill = professionalSkill;
	}
	public int getYearExperience() {
		return yearExperience;
	}
	public void setYearExperience(int yearExperience) {
		this.yearExperience = yearExperience;
	}
	public String getProfessionalSkill() {
		return professionalSkill;
	}
	public void setProfessionalSkill(String professionalSkill) {
		this.professionalSkill = professionalSkill;
	}
	@Override
	public String toString() {
		return "ExperienceCandidate [yearExperience=" + yearExperience + ", professionalSkill=" + professionalSkill
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", birthDay=" + birthDay + ", address="
				+ address + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
