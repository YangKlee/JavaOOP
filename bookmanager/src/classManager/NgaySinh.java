/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 29 thg 11, 2024
*/ 
package classManager;

import java.util.Objects;

public class NgaySinh {
	private int day;
	private int month;
	private int year;
	public NgaySinh(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public NgaySinh(NgaySinh ngaySinhOBJ) {
		super();
		this.day = ngaySinhOBJ.day;
		this.month = ngaySinhOBJ.month;
		this.year = ngaySinhOBJ.year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.day, this.month, this.year);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return (this.day +"/"+ this.month+ "/" + this.year);
	}
	
}
