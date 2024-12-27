/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 12, 2024
*/ 
package entity;

public class dvHanhChinh extends nguoiDungDien {

	public String typeName = "DV Hành Chính";
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public dvHanhChinh (double chiSoCu, double chiSoMoi, double dinhMuc) {
		super(chiSoCu, chiSoMoi, dinhMuc);
		this.giaTrongDM = 100;
		this.giaVuotDM = 150;
	}
}
