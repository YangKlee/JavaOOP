/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package model;

public class Product {
	private int productId;
	private String productName;
	private double listPrice;
	public Product() {
		super();
	}
	public Product(int productId, String productName, double listPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.listPrice = listPrice;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getListPrice() {
		return listPrice;
	}
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	
}
