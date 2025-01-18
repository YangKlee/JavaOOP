/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 17 thg 1, 2025
*/ 
package services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import model.Car;
import model.Motorbike;
import model.Transport;
import model.Truck;
import model.Vehicle;
import res.data;

public class FileServices implements data{
	// C - car
	// M - mortobyte
	// T - truck
	String floderAchive;
	public void FileService(String floderAchive)
	{
		this.floderAchive = floderAchive;
	}
	public boolean importVehicles(String fileName)
	{
		boolean isSuccess = false;
		try {
			BufferedReader fread = new BufferedReader(new FileReader(floderAchive + "/"+fileName));
			String rawInp = "";
			while((rawInp = fread.readLine())!= null)
			{
				String[] rawData = rawInp.split(";");

			}
			isSuccess = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	public void exportVehicles(String fileName)
	{
		try {
			PrintWriter ptr = new PrintWriter(new FileOutputStream(floderAchive + "/"+fileName), true);
			for (Transport trs : lsTransport)
			{
				String data = "";
				String transType = null;
				if (trs.getClass() == Car.class)
					transType = "C";
				else if (trs.getClass() == Motorbike.class)
					transType = "M";
				else if (trs.getClass() == Truck.class)
					transType = "T";
				data += transType +';'+trs.getLicensePlate() + ';' + trs.getManufacturer() + ';' + trs.getYear() + ';';
				if (transType == "C")
				{
					Car c = (Car)trs;
					data += c.getNumSeats() +';'+ c.getFuelType();
				}
				else if (transType == "M")
				{
					Motorbike m = (Motorbike)trs;
					data += m.getEngineCapacity();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
