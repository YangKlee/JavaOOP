/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 17 thg 1, 2025
*/ 
package model;

public class Motorbike extends Transport  {

	private double engineCapacity;
	private final double taxBase = 0.04;
	
	public Motorbike(String licensePlate, String manufacturer, int year, double engineCapacity) {
		super(licensePlate, manufacturer, year);
		this.engineCapacity = engineCapacity;
	}
	
	public Motorbike() {
		super();
	}

	@Override
	public void showVehicleInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateTax(double basePrice) {
		return basePrice+ (taxBase * basePrice);
	}

	@Override
	public double calculateTax(double basePrice, double additionalFee) {
		return basePrice+ (taxBase * basePrice) + additionalFee;
	}

	@Override
	void showBasicInfo() {
		// TODO Auto-generated method stub
		
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public double getTaxBase() {
		return taxBase;
	}

	@Override
	public String toString() {
		return "Motorbike [licensePlate=" + licensePlate + ", manufacturer=" + manufacturer + ", year=" + year
				+ ", engineCapacity=" + engineCapacity + "]";
	}
	
}
