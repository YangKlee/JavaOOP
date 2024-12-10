/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 3 thg 12, 2024
*/ 
package fa.training.entities;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	double getSalePrice() {
		return this.regularPrice - (double)this.manufacturerDiscount;
	}
	
	
}
