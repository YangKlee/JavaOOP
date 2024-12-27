/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 12, 2024
*/ 
package entity;

public class dvSanXuat extends nguoiDungDien {
	public String typeName = "DV Sản xuất";
	public String getTypeName() {
		return typeName;

	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public dvSanXuat(double chiSoCu, double chiSoMoi, double dinhMuc) {
		super(chiSoCu, chiSoMoi, dinhMuc);
		this.giaTrongDM = 700;
		this.giaVuotDM = 1200;
	}
}
