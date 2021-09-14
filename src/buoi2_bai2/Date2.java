package buoi2_bai2;

import java.util.Scanner;

public class Date2 {
	private int ngay;
	private int thang;
	private int nam;
	
//======================================================================//
	public Date2() {
		this.ngay=11;
		this.thang=5;
		this.nam=2002;
	}
	public Date2(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
//======================================================================//
	public int getNgay() {
		return ngay;
	}
	public int getThang() {
		return thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
//======================================================================//
	@Override
	public String toString() {
		return this.ngay+"/"+this.thang+"/"+this.nam;
	}
//======================================================================//
	public void input() {
		Scanner scanner = new Scanner(System.in);
		boolean check=false;
		while(check==false) {
			System.out.println("Ngay: ");
			this.ngay= scanner.nextInt();
			System.out.println("Thang: ");
			this.thang= scanner.nextInt();
			System.out.println("Nam: ");
			this.nam= scanner.nextInt();
			if(hopLe()==true) check=true;
		}
		scanner.close();
	}
//======================================================================//
	public boolean hopLe() {
			return false; 
	}
//======================================================================//
	public Date2 ngayHomSau() {
		Date2 tomorrow = new Date2(this.ngay,this.thang,this.nam);
		
		return tomorrow;
	}
//======================================================================//	
	public Date2 congNgay(int n) {
		Date2 newDate= new Date2(this.ngay,this.thang,this.nam);
		return newDate;
	}
//======================================================================//
	public static void main(String[] args) {
//		Date d = new Date(28, 2, 2001);
//		System.out.println(d.toString());
//		d=d.ngayHomSau();
//		System.out.println(d.toString());
//		d=d.congNgay(20);
//		System.out.println(d.toString());
	}	
}
