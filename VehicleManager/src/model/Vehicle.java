/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 17 thg 1, 2025
*/ 
package model;

public interface Vehicle {
	void showVehicleInfo(); // hiển thị thông tin phương tiện
	double calculateTax(double basePrice); // tính thuế
	double calculateTax(double basePrice, double additionalFee); // tính thuế thêm phó bổ sung 
}
