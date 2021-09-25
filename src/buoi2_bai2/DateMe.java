package buoi2_bai2;

import java.util.Scanner;

public class DateMe {
	private int ngay;
	private int thang;
	private int nam;
	
//======================================================================//
	public DateMe() {
		this.ngay=11;
		this.thang=5;
		this.nam=2002;
	}
	public DateMe(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public DateMe(DateMe obj) {
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
		do {
			System.out.println("Nhap ngay: ");
			this.ngay= scanner.nextInt();
			System.out.println("Nhap thang: ");
			this.thang= scanner.nextInt();
			System.out.println("Nhap nam: ");
			this.nam= scanner.nextInt();
			if(!hopLe()) System.out.println("Hay nhap lai");
		}
		while(!hopLe());
	}
//======================================================================//
	public int lastMonth() {
		if (this.thang==1 || this.thang==3 || this.thang==5 || this.thang==7 || this.thang==8 || this.thang==10 || this.thang==12){
			return 31;
		}
		else if (this.thang==2) {
			if((this.nam % 4 !=0 || this.nam % 100 ==0) && this.nam % 400 !=0) {
				return 28;
			}
			else return 29;
			
		} else return 30;
	}
//======================================================================//
	public boolean hopLe() {
		if(this.ngay>lastMonth() || this.ngay < 1) 
			return false; 
		else return true;
	}
//======================================================================//
	public DateMe ngayHomSau() {
		DateMe tomorrow = new DateMe(this.ngay,this.thang,this.nam);
		if(tomorrow.hopLe()) {
			if(tomorrow.ngay==lastMonth()) {
				if(tomorrow.thang==12) {
					tomorrow.ngay=1;
					tomorrow.thang=1;
					tomorrow.nam+=1;
				} else {
					tomorrow.ngay=1;
					tomorrow.thang+=1;
				}
			} else {
				tomorrow.ngay+=1;
			}			
		}
		return tomorrow;
	}
//======================================================================//	
	public DateMe congNgay(int n) {
		DateMe newDate= new DateMe(this.ngay,this.thang,this.nam);
		do {
			n-=(newDate.lastMonth()-newDate.ngay);
			if(n>0) {
				newDate.ngay= newDate.lastMonth();
				newDate = newDate.ngayHomSau();
				n-=1;
			}
			else {
				n+=newDate.lastMonth()-newDate.ngay;
				newDate.ngay+= n;
				break;
			}
		}while(n>0);
		if(newDate.hopLe()) return newDate; 
		else return newDate= new DateMe(this.ngay,this.thang,this.nam);
	}
//======================================================================//

}
