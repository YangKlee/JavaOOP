/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package fa.training.entities;

import java.io.Serializable;
import java.util.Date;

public abstract class Candidate implements Serializable {
	String firstName;
	String lastName;
	Date birthDay;
	String address;
	String phone;
	String email;
	public Candidate(String firstName, String lastName, Date birthDay, String address, String phone, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String toString() ;
	
	
}
