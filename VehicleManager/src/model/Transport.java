/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 17 thg 1, 2025
*/ 
package model;

public abstract class Transport implements Vehicle {
	protected String licensePlate; //biển số xe
	protected String manufacturer; // Hãng sản xuất
	protected int year ; // năm sản xuất
	abstract void showBasicInfo();
	
	public Transport(String licensePlate, String manufacturer, int year) {
		super();
		this.licensePlate = licensePlate;
		this.manufacturer = manufacturer;
		this.year = year;
	}
	
	public Transport() {
		super();
	}

	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
