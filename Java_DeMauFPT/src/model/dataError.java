/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package model;

public class dataError {
	int line;
	boolean trueBirthday;
	boolean truePhone;
	boolean trueYearExperences;
	boolean duDuLieu;
	boolean trueEmail;
	public dataError(int line, boolean trueBirthday, boolean truePhone,boolean trueEmail, boolean trueYearExperences, boolean duDuLieu) {
		super();
		this.line = line;
		this.trueBirthday = trueBirthday;
		this.truePhone = truePhone;
		this.trueYearExperences = trueYearExperences;
		this.duDuLieu = duDuLieu;
		this.trueEmail = trueEmail;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public boolean isTrueBirthday() {
		return trueBirthday;
	}
	public void setTrueBirthday(boolean trueBirthday) {
		this.trueBirthday = trueBirthday;
	}
	public boolean isTruePhone() {
		return truePhone;
	}
	public void setTruePhone(boolean truePhone) {
		this.truePhone = truePhone;
	}
	public boolean isTrueYearExperences() {
		return trueYearExperences;
	}
	public void setTrueYearExperences(boolean trueYearExperences) {
		this.trueYearExperences = trueYearExperences;
	}
	public boolean isDuDuLieu() {
		return duDuLieu;
	}
	public void setDuDuLieu(boolean duDuLieu) {
		this.duDuLieu = duDuLieu;
	}
	public boolean isHopLe()
	{
		if (trueBirthday && truePhone && trueYearExperences && duDuLieu && trueEmail)
		{
			return true;
		}
		return false;
	}
	
	public boolean isTrueEmail() {
		return trueEmail;
	}
	public void setTrueEmail(boolean trueEmail) {
		this.trueEmail = trueEmail;
	}
	@Override
	public String toString() {
		return "dataError [line=" + line + ", trueBirthday=" + trueBirthday + ", truePhone=" + truePhone
				+ ", trueYearExperences=" + trueYearExperences + ", duDuLieu=" + duDuLieu + ", trueEmail=" + trueEmail
				+ "]";
	}
	
	
	
}
