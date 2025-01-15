/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package services;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import DAO.DAOExpCandidate;
import DAO.DAOFreshCandidate;
import DAO.DAOInternCandidate;
import model.*;
import model.dataError;
import references.*;
public class DataServices implements data {
	//FileServices fileservices = new FileServices();
	SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy/MM/dd");
	SimpleDateFormat simpleDateShort = new SimpleDateFormat("MM/yyyy");
	public void importData(int line ,String[] rawData)
	{
		String typeCandidate = rawData[0];
		chkExceptionInp chk = new chkExceptionInp(rawData);
		
		//public dataError(int line, boolean trueBirthday, boolean truePhone,boolean trueEmail, boolean trueYearExperences, boolean duDuLieu
		dataError dataerr = new dataError(line, chk.chkBirth(), chk.chkPhone(), chk.chkEmail(), chk.chkYearExp(), chk.chkDuLieuThua());
		if (dataerr.isHopLe())
		{
			// nhap thong tin co ban
			String name = rawData[1];
			Date birthDate = null;
			try {
				birthDate = simpleDate.parse(rawData[2]);
			} catch (ParseException PeDate) {
				// TODO Auto-generated catch block
				PeDate.printStackTrace();
			}
			String address = rawData[3];
			String queQuan = rawData[4];
			String phone = rawData[5];
			String email = rawData[6];
			candidate importCan = null;
			if (typeCandidate.equals("1")) // Experience candidate
			{
				ExpCandidate expInput = new ExpCandidate();
				expInput.setHoTen(name);
				expInput.setNgaySinh(birthDate);
				expInput.setDiaChi(address);
				expInput.setQueQuan(queQuan);
				expInput.setEmail(email);
				expInput.setSoDT(phone);
				expInput.setNamKN(Double.parseDouble(rawData[7]));
				expInput.setKyNang(rawData[8]);
				expInput.setNoiLamViecLast(rawData[9]);				
				importCan = expInput;
			}
			else if (typeCandidate.equals("2")) // Fresher candidate
			{
				FreshCandidate freshInput = new FreshCandidate();
				freshInput.setHoTen(name);
				freshInput.setNgaySinh(birthDate);
				freshInput.setDiaChi(address);
				freshInput.setQueQuan(queQuan);
				freshInput.setEmail(email);
				freshInput.setSoDT(phone);
				//simpleDate = new SimpleDateFormat("MM/yyyy");
				try {
					freshInput.setNgayTotNghiep(simpleDateShort.parse(rawData[10]));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				freshInput.setXepLoaiTotNghiep(rawData[11]);
				freshInput.setTruongTotNghiep(rawData[12]);
				importCan = freshInput;
			}
			else if (typeCandidate.equals("3")) //Intern candidate
			{
				InternCandidate internInput = new InternCandidate();
				internInput.setHoTen(name);
				internInput.setNgaySinh(birthDate);
				internInput.setDiaChi(address);
				internInput.setQueQuan(queQuan);
				internInput.setEmail(email);
				internInput.setSoDT(phone);
				internInput.setChuyenNganhHoc(rawData[13]);
				internInput.setHocKyDangHoc(Integer.parseInt(rawData[14]));
				internInput.setTruongHoc(rawData[15]);
				//simpleDate = new SimpleDateFormat("MM/yyyy");
				try {
					internInput.setNgayTotNghiep(simpleDateShort.parse(rawData[16]));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				importCan = internInput;
			}
			if (importCan != null)
				listCandidate.add(importCan);
		}
		else
		{
			listError.add(dataerr);
		}
	}
	public void exportError(String urlFile)
	{
		FileServices fileServices = new FileServices();
		String errOut = "";
		for (dataError err : listError)
		{
			if (!err.isTrueBirthday())
				errOut += "Dòng "+err.getLine()+": Ngày sinh không đúng định dạng\n";
			if (!err.isTruePhone())
				errOut+= "Dòng "+err.getLine()+": Số điện thoại không đúng định dạng \n";
			if (!err.isTrueYearExperences())
				errOut+= "Dòng "+err.getLine()+": Năm kinh nghiệm không đúng định dạng\n";
				//fileServices.writeAppendFile(urlFile, "Dòng: "+err.getLine()+"Năm kinh nghiệm không đúng định dạng");
			if (!err.isDuDuLieu())
				errOut+= "Dòng "+err.getLine()+": Thừa dữ liệu\n";
			if(!err.isTrueEmail())
				errOut += "Dòng "+err.getLine()+": Email không đúng định dạng!\n";
		}
		fileServices.writeAppendFile(urlFile, errOut);
	}
	public void exportToDB()
	{
		for (candidate c: listCandidate)
		{
			if (c.getClass() == ExpCandidate.class)
			{
				if (DAOExpCandidate.get().insertDB((ExpCandidate)c))
					System.out.println("Thêm ExpCandidate thành công!");
				else
					System.out.println("Thêm ExpCandidate thất bại!");
			}
			else if (c.getClass() == FreshCandidate.class)
			{
				if (DAOFreshCandidate.get().insertDB((FreshCandidate)c))
					System.out.println("Thêm FreshCandidat thành công!");
				else
					System.out.println("Thêm FreshCandidat thất bại!");
			}
			else if (c.getClass() == InternCandidate.class)
			{
				if (DAOInternCandidate.get().insertDB((InternCandidate)c))
					System.out.println("Thêm InternCandidate thành công!");
				else
					System.out.println("Thêm InternCandidate thất bại!");
			}
		}
	}
}
