package buoi3_bai3;

import java.util.Scanner;

import buoi2_bai2.Date;

public class SinhVien{
	String mssv;
	String hoTen;
	Date ngaySinh;
	final static int MAX= 50;
	int soHocPhan;
	String[] tenHocPhan;
	String[] diemHocPhan;

//======================================================================//
	public SinhVien() {
		this.mssv= new String();
		this.hoTen= new String();
		this.ngaySinh= new Date();
		this.soHocPhan= 0;
		this.tenHocPhan= new String[SinhVien.MAX];
		this.diemHocPhan= new String[SinhVien.MAX];
	}
	
	public SinhVien(SinhVien sv) {
		this.mssv= new String(sv.mssv);
		this.hoTen= new String(sv.hoTen);
		this.ngaySinh= new Date(sv.ngaySinh);
		this.soHocPhan=sv.soHocPhan;
		this.tenHocPhan= new String[SinhVien.MAX];
		this.diemHocPhan= new String[SinhVien.MAX];
		
		for(int i=0; i<sv.soHocPhan; i++) {
			this.tenHocPhan[i]= new String(sv.tenHocPhan[i]);
			this.diemHocPhan[i]= new String(sv.diemHocPhan[i]);
		}
	}
	
	public SinhVien(String mssv, String hoTen, Date ngaySinh, int soHocPhan, String[] tenHocPhan, String[] diemHocPhan) {
		this.mssv= mssv;
		this.hoTen= hoTen;
		this.ngaySinh= ngaySinh;
		this.soHocPhan= soHocPhan;
		this.tenHocPhan= new String[SinhVien.MAX];
		this.diemHocPhan= new String[SinhVien.MAX];
		
		for(int i=0; i<this.soHocPhan; i++) {
			this.tenHocPhan[i]= new String(tenHocPhan[i]);
			this.diemHocPhan[i]= new String(diemHocPhan[i]);
		}
	}
	
	public SinhVien(String mssv, String hoTen, Date ngaySinh) {
		this.mssv= mssv;
		this.hoTen= hoTen;
		this.ngaySinh= ngaySinh;
		this.soHocPhan= 0;
		this.tenHocPhan= new String[SinhVien.MAX];
		this.diemHocPhan= new String[SinhVien.MAX];
	}
//======================================================================//
	public String getMssv() {
		return mssv;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public String getTen() {
		String s = this.hoTen;
		return s.substring(s.lastIndexOf(' ')+1); 
	}
	
	public Date getNgaySinh() {
		return ngaySinh;
	}
	
	public int getSoHocPhan() {
		return soHocPhan;
	}
	
	public String[] getTenHocPhan() {
		return tenHocPhan;
	}
	
	public String[] getDiemHocPhan() {
		return diemHocPhan;
	}
//======================================================================//
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public void setSoHocPhan(int soHocPhan) {
		this.soHocPhan = soHocPhan;
	}
	
	public void setTenHocPhan(String[] dsHocPhan) {
		this.tenHocPhan = dsHocPhan;
	}
	
	public void setDiemHocPhan(String[] diemHocPhan) {
		this.diemHocPhan = diemHocPhan;
	}
//======================================================================//		
	public void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhap mssv: ");
			this.mssv= scanner.nextLine();
			System.out.print("Nhap ho ten: ");
			this.hoTen= scanner.nextLine();
			System.out.println("Nhap ngay sinh");
			this.ngaySinh.nhapNgay();
	}
//======================================================================//		
	public void nhapDiemHocPhan() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("Nhap so luong mon hoc: ");
			this.soHocPhan= scanner.nextInt();
		}while(this.soHocPhan>MAX);
		scanner.nextLine();
		for(int i=0; i<this.soHocPhan; i++) {
			System.out.print("Nhap ten mon hoc thu "+(i+1)+": ");
			//this.tenHocPhan[i]= new String(scanner.nextLine());
			this.tenHocPhan[i]= scanner.nextLine();
			System.out.print("Nhap diem mon hoc thu "+(i+1)+": ");
			this.diemHocPhan[i]=scanner.nextLine();
		}
	}
//======================================================================//	
	@Override
	public String toString() {
		String s= "Mssv: "+this.mssv+", HoTen: "+this.hoTen+", Ngay sinh: "+this.ngaySinh.toString()+" [";
		for(int i=0; i<this.soHocPhan; i++) {
			s+=this.tenHocPhan[i]+": "+this.diemHocPhan[i]+";";
		}
		s+="]";
		return s;
	}
//======================================================================//		
	public void dangKyHocPhan() {
		if(this.soHocPhan<MAX) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhap ten hoc phan de them: ");
			this.tenHocPhan[this.soHocPhan] = scanner.nextLine();
			System.out.print("Nhap diem hoc phan: ");
			this.diemHocPhan[this.soHocPhan] = scanner.nextLine(); 
			this.soHocPhan++;
		}
		else {
			System.out.println("So luong hoc phan da day!");
		}
	}
//======================================================================//		
	public void xoaHocPhan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten hoc phan can xoa: ");
		String tenHocPhan= scanner.nextLine();
		for (int i=0; i<this.soHocPhan; i++) {
			if(this.tenHocPhan[i].compareToIgnoreCase(tenHocPhan)==0) {
				for(int j=i; j<this.soHocPhan-1; j++) {
					this.tenHocPhan[j]=new String(this.tenHocPhan[j+1]);
					this.diemHocPhan[j]= new String(this.diemHocPhan[j+1]);
				}
				this.soHocPhan--;
				break;
			}
		}
	}
//======================================================================//		
	public float diemTB4() {
		float d=0.0f;
		for(int i=0; i<this.soHocPhan; i++) {
			if(this.diemHocPhan[i].equals("A")) d+=4;
			else if(this.diemHocPhan[i].equals("B+")) d+=3.5;
			else if(this.diemHocPhan[i].equals("B")) d+=3;
			else if(this.diemHocPhan[i].equals("C+")) d+=2.5;
			else if(this.diemHocPhan[i].equals("C")) d+=2;
			else if(this.diemHocPhan[i].equals("D+")) d+=1.5;
			else if(this.diemHocPhan[i].equals("D")) d+=1; 
		}
		return d/this.soHocPhan;
	}
//======================================================================//	
//	public static void main(String[] args) {
//		SinhVien sv = new SinhVien();
//		sv.nhap();
//		sv.nhapDiemHocPhan();
//		System.out.println(sv.toString());
//		sv.dangKyHocPhan();
//		System.out.println(sv.toString());
//		sv.xoaHocPhan();
//		System.out.println(sv.toString());
//		System.out.println("Diem trung binh: "+sv.diemTB4());
//	}
}
