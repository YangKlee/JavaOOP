/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 12, 2024
*/ 
package entity;

public class khanhHang extends nguoiDungDien {
	public String typeName = "KH Cá nhân";

	
	public khanhHang(double chiSoCu, double chiSoMoi, double dinhMuc) {
		super(chiSoCu, chiSoMoi, dinhMuc);
		this.giaTrongDM = 200;
		this.giaVuotDM = 500;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
