/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 17 thg 1, 2025
*/ 
package model;

public class Car extends Transport {

	private int numSeats ; 
	private String fuelType;
	private final double taxBase = 0.06;
	public Car(String licensePlate, String manufacturer, int year, int numSeats, String fuelType) {
		super(licensePlate, manufacturer, year);
		this.numSeats = numSeats;
		this.fuelType = fuelType;
	}
	
	public Car() {
		super();
	}

	@Override
	public void showVehicleInfo() {
		// ???
	}

	@Override
	public double calculateTax(double basePrice) {
		return basePrice+ (taxBase * basePrice);
	}

	@Override
	public double calculateTax(double basePrice, double additionalFee) {
		return basePrice+ (taxBase * basePrice) + additionalFee;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	void showBasicInfo() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Car [licensePlate=" + licensePlate + ", manufacturer=" + manufacturer + ", year=" + year + ", numSeats="
				+ numSeats + ", fuelType=" + fuelType + " ]";
	}
	

}
