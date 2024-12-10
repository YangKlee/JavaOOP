/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 3 thg 12, 2024
*/ 
package fa.training.entities;

public class Sedan extends Car {
	int length;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	@Override
	double getSalePrice() {
		double discount = 0;
		if (this.length > 20)
			discount = this.regularPrice * 0.05;
		else
			discount = this.regularPrice * 0.1;
		return discount;
	}
	
}
