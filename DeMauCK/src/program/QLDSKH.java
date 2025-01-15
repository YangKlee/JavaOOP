/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 15 thg 1, 2025
*/ 
package program;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import model.*;
public class QLDSKH implements Serializable{
	private  List<TienDien> dskh ;
	public  boolean docFile(String tenFile)
	{
		boolean isSuccess = false;
		BufferedReader bread = null;
		dskh = new ArrayList<TienDien>();
		try {
			bread = new BufferedReader(new FileReader(tenFile));
			String dataInp = "";
			while ((dataInp = bread.readLine()) != null)
			{
				//System.out.println(dataInp);
				String[] rawData = dataInp.split(", ");
				if (rawData[0].equals("CN"))
				{
					dskh.add(new TDHoCaNhan(rawData[1], Integer.parseInt(rawData[2])));
				}
				else if (rawData[0].equals("TC"))
				{
					dskh.add(new TDToChuc(rawData[1], Integer.parseInt(rawData[2]), Integer.parseInt(rawData[3])));
					
				}
				else if (rawData[0].equals("HSX"))
				{
					dskh.add(new TDHoSanXuat(rawData[1], Integer.parseInt(rawData[2])));
				}
			}
			isSuccess = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bread.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//return (ArrayList<TienDien>) dskh;
		return isSuccess;
	}
	public boolean saveFileCN(String name)
	{
		boolean isSuccess = false;
		FileOutputStream fout = null;
		ObjectOutputStream objout = null;
		try {
			fout = new FileOutputStream(name);
			objout = new ObjectOutputStream(fout);
			for (TienDien hcn : dskh)
			{
				if (hcn.getClass() == TDHoCaNhan.class)
					objout.writeObject(hcn);
			}
			isSuccess = true;;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (fout != null && objout != null)
			{
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					objout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return isSuccess;
	}
	public TienDien timKiemMAX()
	{

		TienDien res = null ;
		double max = 0;
		for (TienDien td : dskh)
		{
			if (td.tinhTien() > max)
			{
				res = td;
				max = td.tinhTien();
			}
		}
		return res;
	}
	public void themDTSX(TDHoSanXuat hsx)
	{
		dskh.add(hsx);
	}

}
