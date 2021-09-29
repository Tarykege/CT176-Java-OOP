package buoi4_bai2;

import java.util.Scanner;

import buoi2_bai2.Date;
import buoi3_bai3.SinhVien;

public class SVCNTT extends SinhVien {
	private String tk;
	private String mk;
	private String email;

//======================================================================//
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
//======================================================================//
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap tai khoan: ");
		this.tk=scanner.nextLine();
		System.out.print("Nhap mat khau: ");
		this.mk=scanner.nextLine();
		System.out.print("Nhap email: ");
		this.email=scanner.nextLine();
	}
//======================================================================//	
	@Override
	public String toString() {
		return super.toString()+", TK: "+this.tk+", MK: "+this.mk+", Email: "+this.email;
	}
//======================================================================//
	public String getTk() {
		return tk;
	}
	public String getMk() {
		return mk;
	}
	public String getEmail() {
		return email;
	}
//======================================================================//
	public void setTk(String tk) {
		this.tk = tk;
	}
	public void setMk(String mk) {
		this.mk = mk;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//======================================================================//
//	public static void main(String[] args) {
//		SVCNTT a= new SVCNTT();
//		a.nhap();
//		a.nhapDiemHocPhan();
//		System.out.println(a);
//		a.setMk("MotNgayNangDepRangNgoi");
//		System.out.println(a);
//		System.out.println(a.getEmail());
//	}
}
