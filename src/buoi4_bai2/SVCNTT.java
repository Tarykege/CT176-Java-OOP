package buoi4_bai2;

import buoi2_bai2.Date;
import buoi3_bai3.SinhVien;

public class SVCNTT extends SinhVien {
	String tk;
	String mk;
	String email;
	
	public SVCNTT() {
		super();
		this.tk=new String();
		this.mk=new String();
		this.email=new String();
	}
	
	public SVCNTT(String mssv, String hoTen, Date ngaySinh, String tk, String mk, String email) {
		super(mssv,hoTen,ngaySinh);
		this.tk=new String(tk);
		this.mk=new String(mk);
		this.email=new String(email);
	}
	
	public SVCNTT(SVCNTT obj) {
		super(obj);
		this.tk=new String(obj.tk);
		this.mk=new String(obj.mk);
		this.email=new String(obj.email);
	}
}
