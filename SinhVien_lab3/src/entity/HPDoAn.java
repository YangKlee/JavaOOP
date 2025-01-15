/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 6 thg 1, 2025
*/ 
package entity;

import java.util.ArrayList;

public class HPDoAn extends DiemHP{
	ArrayList<Double> dtbHDBV = new ArrayList<>(5);

	public HPDoAn(String tenHP, int soTinChi, ArrayList<Double> dtbHDBV) {
		super(tenHP, soTinChi);
		this.dtbHDBV = dtbHDBV;
	}
	public HPDoAn(String tenHP, int soTinChi, double dtbBV1, double dtbBV2, double dtbBV3, double dtbBV4, double dtbBV5) {
		super(tenHP, soTinChi);
		dtbHDBV.add(dtbBV1);
		dtbHDBV.add(dtbBV2);
		dtbHDBV.add(dtbBV3);
		dtbHDBV.add(dtbBV4);
		dtbHDBV.add(dtbBV5);
	}
	public double tinhDiem()
	{
		double sum = 0;
		for (Double d : dtbHDBV)
		{
			sum += d.doubleValue();
		}
		return sum / (double)dtbHDBV.size();
	}
}
