/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package entity;

import java.io.Serializable;

public class Date implements Serializable{
	int d, m, y;

	@Override
	public String toString() {
		return "Date [d=" + d + ", m=" + m + ", y=" + y + "]";
	}

	public Date(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}
	
}
