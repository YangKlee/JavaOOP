/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package fa.training.entities;

import java.io.Serializable;
import java.util.Date;

public class FresherCandidate extends Candidate  implements Serializable{
	Date gradurationDate;
	String gradurationRank;
	String education;
	public FresherCandidate(String firstName, String lastName, Date birthDay, String address, String phone,
			String email, Date gradurationDate, String gradurationRank, String education) {
		super(firstName, lastName, birthDay, address, phone, email);
		this.gradurationDate = gradurationDate;
		this.gradurationRank = gradurationRank;
		this.education = education;
	}
	public Date getGradurationDate() {
		return gradurationDate;
	}
	public void setGradurationDate(Date gradurationDate) {
		this.gradurationDate = gradurationDate;
	}
	public String getGradurationRank() {
		return gradurationRank;
	}
	public void setGradurationRank(String gradurationRank) {
		this.gradurationRank = gradurationRank;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	@Override
	public String toString() {
		return "FresherCandidate [gradurationDate=" + gradurationDate + ", gradurationRank=" + gradurationRank
				+ ", education=" + education + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDay="
				+ birthDay + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
