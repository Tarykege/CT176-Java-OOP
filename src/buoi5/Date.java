package buoi5;

import java.util.Scanner;

public class Date{
	private int ngay;
	private int thang;
	private int nam;
	
//======================================================================//
	public Date() {
		this.ngay=11;
		this.thang=5;
		this.nam=2002;
	}
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public Date(Date obj) {
		this.ngay = obj.ngay;
		this.thang = obj.thang;
		this.nam = obj.nam;
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
	public void nhapNgay() {
		Scanner scanner = new Scanner(System.in);
		do{
			System.out.print("Nhap ngay: ");
			this.ngay= scanner.nextInt();
			System.out.print("Nhap thang: ");
			this.thang= scanner.nextInt();
			System.out.print("Nhap nam: ");
			this.nam= scanner.nextInt();
			if(!hopLe()) System.out.println("Hay nhap lai");;
		}
		while(!hopLe());
		scanner.nextLine();
	}
//======================================================================//
	public boolean hopLe() {
			int[] max = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			if((this.nam%4==0 && this.nam %100!=0)|| this.nam%400==0 ) max[2] = 29;
			if(ngay>0 && thang>0 && nam>0 && thang<13 && ngay <=max[thang]) {
				return true;
			}
			return false;
	}
//======================================================================//
	public Date ngayHomSau() {
		Date tomorrow = new Date(this.ngay,this.thang,this.nam);
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
	public Date congNgay(int n) {
		Date newDate= new Date(this.ngay,this.thang,this.nam);
		for(int i=0; i<n; i++) {
			newDate=newDate.ngayHomSau();
		}
		return newDate;
	}
}
