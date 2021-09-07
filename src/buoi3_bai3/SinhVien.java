package buoi3_bai3;

import buoi2_bai2.Date;

public class SinhVien {
	String mssv;
	String name;
	Date ngaySinh;
	int soHocPhan;
	String[] dsHocPhan;
	String[] diemHocPhan;
	
	public SinhVien() {
	}
	public SinhVien(String mssv, String name, Date ngaySinh, int soHocPhan, String[] dsHocPhan, String[] diemHocPhan) {
		this.mssv= mssv;
		this.name=name;
		this.ngaySinh= ngaySinh;
		this.soHocPhan= soHocPhan;
		this.dsHocPhan= dsHocPhan;
		this.diemHocPhan= diemHocPhan;
	}
	
	public void nhapSV() {

	}
	
	public void nhapDiemHocPhan() {
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	float diemTB4() {
		return 0;
	}
	
	void dangKyHocPhan() {
		
	}
	
	void xoaHocPhan() {
	
	}
	
	
}
