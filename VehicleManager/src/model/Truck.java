/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 17 thg 1, 2025
*/ 
package model;

public class Truck extends Transport{

	private double loadCapacity;
	private final double taxBase = 0.1;
	
	public Truck(String licensePlate, String manufacturer, int year, double loadCapacity) {
		super(licensePlate, manufacturer, year);
		this.loadCapacity = loadCapacity;
	}
	
	public Truck() {
		super();
	}
	
	
	public double getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public double getTaxBase() {
		return taxBase;
	}

	@Override
	public void showVehicleInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateTax(double basePrice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateTax(double basePrice, double additionalFee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void showBasicInfo() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "Truck [licensePlate=" + licensePlate + ", manufacturer=" + manufacturer + ", year=" + year
				+ ", loadCapacity=" + loadCapacity + "]";
	}
	
}
