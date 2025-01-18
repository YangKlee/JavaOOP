/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 17 thg 1, 2025
*/ 
package services;

import model.Car;
import model.Transport;
import res.data;

public class DataServices implements data {
	public void addNewVehicles(Transport transNew)
	{
		data.lsTransport.add(transNew);
		System.out.println("Thêm phương tiện thành công!");
	}
	public void importFromRawData(String[] rawData)
	{
		String bienSo = rawData[1];
		String hangSX = rawData[2];
		int namSX = Integer.parseInt(rawData[3]);
		if (rawData[0] == "C")
		{
			Car c = new Car();
			c.setLicensePlate(bienSo);
			c.setManufacturer(hangSX);
			c.setYear(namSX);
			c.setNumSeats(Integer.parseInt(rawData[4]));
			c.setFuelType(rawData[5]);
			
		}
	}
	public void softYearSX()
	{
		for (int i = 0; i < lsTransport.size(); i++)
		{
			for (int j = i+1; j < lsTransport.size(); j++)
			{
				if (lsTransport.get(i).getYear() < lsTransport.get(j).getYear() )
				{
					Transport trsTmp = lsTransport.get(i);
					lsTransport.set(i, lsTransport.get(j));
					lsTransport.set(j, trsTmp);
				}
			}
		}
	}
	public Transport findLiscensePlate(String bienSo)
	{
		for (Transport trs : lsTransport)
		{
			if (trs.getLicensePlate().equals(bienSo))
			{
				return trs;
			}
		}
		return null;
	}
}
