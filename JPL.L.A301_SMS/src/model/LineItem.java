/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package model;

public class LineItem {
	private int orderId;
	private int productId;
	private int quality;
	private double price;
	public LineItem() {
		super();
	}
	public LineItem(int orderId, int productId, int quality, double price) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quality = quality;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
