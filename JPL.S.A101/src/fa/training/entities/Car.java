/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 3 thg 12, 2024
*/ 
package fa.training.entities;

public abstract class Car {
	int speed;
	double regularPrice;
	String color;
	abstract double getSalePrice();
	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
}
