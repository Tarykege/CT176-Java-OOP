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
		do{
			System.out.println("Ngay: ");
			this.ngay= scanner.nextInt();
			System.out.println("Thang: ");
			this.thang= scanner.nextInt();
			System.out.println("Nam: ");
			this.nam= scanner.nextInt();
			if(!hopLe()) System.out.println("Please enter again");;
		}
		while(!hopLe());
	}
//======================================================================//
	public boolean hopLe() {
			int[] max = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			if(this.nam%4==0) max[thang] = 29;
			if(ngay>0 && thang>0 && nam>0 && thang<13 && ngay <=max[thang]) {
				return true;
			}
			return false;
	}
//======================================================================//
	public Date2 ngayHomSau() {
		Date2 tomorrow = new Date2(this.ngay,this.thang,this.nam);
		tomorrow.ngay++;
		if(!tomorrow.hopLe()) {
			tomorrow.ngay=1;
			tomorrow.thang++;
			if(!tomorrow.hopLe()) {
				tomorrow.thang=1;
				tomorrow.nam++;
			}
		}
		return tomorrow;
	}
//======================================================================//	
	public Date2 congNgay(int n) {
		Date2 newDate= new Date2(this.ngay,this.thang,this.nam);
		for(int i=0; i<n; i++) {
			newDate=newDate.ngayHomSau();
		}
		return newDate;
	}
}
