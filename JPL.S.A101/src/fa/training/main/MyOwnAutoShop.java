/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 3 thg 12, 2024
*/ 
package fa.training.main;
import java.util.ArrayList;

import fa.training.entities.*;
public class MyOwnAutoShop {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sedan(100, 20000000, "Red", 100));
		carList.add(new Sedan(150, 22300000, "Blue", 10));
		carList.add(new Sedan(200, 31500000, "Green", 3));
		carList.add(new Ford(330, 51200000, "Black", 2024, 0));
		carList.add(new Ford(230, 40000000, "Pickeball", 2023, 500000));
		carList.add(new Truck(260, 20000000, "Red", 1000));
		carList.add(new Truck(360, 60000000, "Blackpink", 2500));
	}

}
