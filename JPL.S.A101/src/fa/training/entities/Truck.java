/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 3 thg 12, 2024
*/ 
package fa.training.entities;

public class Truck extends Car {

	int weight;
	
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	double getSalePrice()
	{
		double discount = 0;
		if (this.weight > 2000)
			discount = this.regularPrice * 0.1;
		else
			discount = this.regularPrice * 0.2;
		return discount;
	}
}
