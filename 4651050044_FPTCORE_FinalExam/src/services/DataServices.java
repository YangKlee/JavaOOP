/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JSpinner.ListEditor;

import DAO.DAODirStudents;
import DAO.DAOExamStudents;
import model.DirectStudent;
import model.ExamStudent;
import model.Student;

import model.errorData;
import resources.data;

public class DataServices implements data {
	public void exportError(String urlFile)
	{
		FileServices fileServices = new FileServices();
		String errOut = "";
		for (errorData err : errorDatas)
		{
			if (!err.isTrueNgaySinh())
				errOut += "Dòng "+err.getLine()+": Sai định dạng ở trường ngày sinh\n";
			if (!err.isTrueNgayThiTuyen())
				errOut += "Dòng "+err.getLine()+": Sai định dạng ở trường ngày thi tuyển\n";
			if (!err.isTrueSoDT())
				errOut += "Dòng "+err.getLine()+": Sai định dạng ở trường số điện thoại\n";
			if (!err.isTrueDiemThi())
				errOut += "Dòng "+err.getLine()+": Sai định dạng ở trường tổng điểm thi\n";
			if (!err.isTrueGioiTinh())
				errOut += "Dòng "+err.getLine()+": Sai định dạng ở trường giới tính\n";
			if (!err.isTrueCapDo())
				errOut += "Dòng "+err.getLine()+": Sai định dạng ở trường cấp độ\n";
			if(!err.isTrueXepLoai())
				errOut += "Dòng "+err.getLine()+": Sai định dạng ở trường xếp loại giải\n";
			if(!err.isDuDuLieu())
				errOut += "Dòng "+err.getLine()+": Thừa dữ liệu\n";
		}
		fileServices.writeAppendFile(urlFile, errOut);
	}
	public void exportDB()
	{
		for (Student st : listStudents)
		{
			if (st.getClass() == ExamStudent.class)
			{
				if (DAOExamStudents.get().addToDB((ExamStudent)st))
				{
					System.out.println("Thêm exam student thành công vào db");
				}
				else
				{
					System.out.println("Thêm exam student thất bại vào db");
				}
			}
			else if (st.getClass() == DirectStudent.class)
			{
				if (DAODirStudents.get().addToDB((DirectStudent)st))
				{
					System.out.println("Thêm DirectStudent thành công vào db");
				}
				else
				{
					System.out.println("Thêm DirectStudent thất bại vào db");
				}
			}
		}
	}
	public void importData(int line,String[] rawData)
	{
		int typeStudent = Integer.parseInt(rawData[0]);
		// 1: sv thi tuyen
		// 2: sv 
		errorData err = new errorData();
		chkExceptionInp chkErr = new chkExceptionInp(rawData);
		err.setLine(line);
		err.setTrueNgaySinh(chkErr.chkNgaySinh());
		err.setTrueNgayThiTuyen(chkErr.chkNgayThiTuyen());
		err.setTrueSoDT(chkErr.chkSoDT());
		err.setTrueDiemThi(chkErr.chkTongDiemThi());
		err.setTrueGioiTinh(chkErr.chkGioiTinh());
		err.setTrueCapDo(chkErr.chkCapDoGiai());
		err.setTrueXepLoai(chkErr.chkXepLoaiGiai());
		err.setDuDuLieu(chkErr.chkDuLieuThua());
		//System.out.println(err.toString());
		if (err.isHopLe())
		{
			System.out.println("Dòng " + line +" hợp lệ");
			String hoTen = rawData[1];
			SimpleDateFormat simpDate = new SimpleDateFormat("dd-MM-yyyy");
			Date ngaySinh = null;
			try {
				ngaySinh = simpDate.parse(rawData[2]);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String gioiTinh = rawData[3];
			String dc = rawData[4];
			String qq = rawData[5];
			String soDt = rawData[6];
			String email = rawData[7];
			if (typeStudent == 1)
			{
				ExamStudent exStd = new ExamStudent();
				exStd.setNgaySinh(ngaySinh);
				exStd.setHoTen(hoTen);
				exStd.setGioiTinh(gioiTinh);
				exStd.setDiaChi(dc);
				exStd.setQueQuan(qq);
				exStd.setSoDT(soDt);
				exStd.setEmail(email);
				try {
					exStd.setNgayThiTuyen(simpDate.parse(rawData[8]));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				exStd.setTongDiem(Double.parseDouble(rawData[9]));
				//System.out.println(exStd.toString());
				listStudents.add(exStd);
			}
			else if (typeStudent == 2)
			{
				DirectStudent dirStudent = new DirectStudent();
				dirStudent.setNgaySinh(ngaySinh);
				dirStudent.setHoTen(hoTen);
				dirStudent.setGioiTinh(gioiTinh);
				dirStudent.setDiaChi(dc);
				dirStudent.setQueQuan(qq);
				dirStudent.setSoDT(soDt);
				dirStudent.setEmail(email);
				dirStudent.setCapDoGiaiThuong(rawData[10]);	
				dirStudent.setTenGiai(rawData[11]);	
				dirStudent.setNamDatGiai(Integer.parseInt(rawData[12]));
				dirStudent.setXepLoaiGiai(rawData[13]);	
				System.out.println(dirStudent.toString());
				listStudents.add(dirStudent);
			}
		}
		else
		{
			errorDatas.add(err);
			System.out.println("Dòng " + line +" không hợp lệ");
		}
	}
}
