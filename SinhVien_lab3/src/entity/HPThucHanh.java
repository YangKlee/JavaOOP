/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 5 thg 1, 2025
*/ 
package entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HPThucHanh extends DiemHP {
	private ArrayList<Double> dtbTH;

	public HPThucHanh(String tenHP, int soTinChi, Double...values) {
		super(tenHP, soTinChi);
		this.dtbTH = new ArrayList<Double>(Arrays.asList(values));
	}
	@Override
	public double tinhDiem()
	{
		double sum = 0;
		for (Double d : dtbTH)
		{
			sum += d.doubleValue();
		}
		return sum / dtbTH.size();
	}
	
}
