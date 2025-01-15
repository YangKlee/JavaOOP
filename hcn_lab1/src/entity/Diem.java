/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 4 thg 1, 2025
*/ 
package entity;

public class Diem {
	private double x, y;
	public Diem(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public double khoangCach(Diem p)
	{
		double bieuThucX = Math.pow(p.x - this.x, 2);
		double bieuThucY = Math.pow(p.y - this.y, 2);
		return Math.sqrt(bieuThucX+ bieuThucY); 
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String toString()
	{
		return "("+this.x+", "+this.y+")";
	}
}
