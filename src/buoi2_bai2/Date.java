package buoi2_bai2;

import java.util.Scanner;

public class Date {
	int ngay;
	int thang;
	int nam;
	public Date() {
	}
//======================================================================//
	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
//======================================================================//
	public String Display() {
		return this.ngay+"/"+this.thang+"/"+this.nam;
	}
//======================================================================//
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ngay: ");
		this.ngay= scanner.nextInt();
		System.out.println("Thang: ");
		this.thang= scanner.nextInt();
		System.out.println("Nam: ");
		this.nam= scanner.nextInt();
		scanner.close();
	}
//======================================================================//
	public int lastMonth(int thang, int nam) {
		if (thang==1 || thang==3 || thang==5 || thang==7 || thang==8 || thang==10 || thang==12){
			return 31;
		}
		else if (thang==2) {//neu dung 1 va 2 thi false
			if((nam % 4 !=0 || nam % 100 ==0) && nam % 400 !=0) {
				return 28;
			}
			else 
				return 29;
		} else 
			return 30;
	}
//======================================================================//
	public boolean hopLe() {
//		if (this.thang==2) {//neu dung 1 va 2 thi false
//			if((this.nam % 4 !=0 || this.nam % 100 ==0)&& this.nam % 400 !=0) {
//				if (this.ngay>28 || this.ngay<1) return false;
//			}
//			else if(this.ngay>29 || this.ngay<1) return false;
//		}
//		else if (this.thang==1 || this.thang==3 || this.thang==5 || this.thang==7 || this.thang==8 ||this.thang==10 ||this.thang==12){
//			if(this.ngay>31 || this.ngay<1) return false;
//		}
//		else if (this.thang==4 || this.thang==6 || this.thang==9 || this.thang==11){
//			if(this.ngay>30 ||this.ngay<1) return false;
//		} else if (this.nam<0 || (this.thang>12 || this.thang<1)) return false;
//		return true;
		if(this.ngay>lastMonth(this.thang,this.nam) || this.ngay < 1) 
			return false; else return true;
	}
//======================================================================//
	public Date ngayHomSau() {
//		Date tomorrow;
//		int ng,t,n;
//		if(this.ngay==31) {
//			if(this.nam==12) {
//				ng=1; t=1; n=this.nam+1;				
//			}else {
//				ng=1; t=this.thang+1; n=this.nam;
//			} 
//		} else if (this.thang==4 || this.thang==6 || this.thang==9 || this.thang==11) {
//			ng=1; t=this.thang+1; n=this.nam;
//		} else {
//			ng=this.ngay+1; t=this.thang+1; n=this.nam;
//		}
//		return tomorrow = new Date(ng,t,n);
		Date tomorrow;
		int d,m,y;
		if(this.ngay==lastMonth(this.thang,this.nam)) {
			if(this.thang==12) {
				d=1;
				m=1;
				y=this.nam+1;
			} else {
				d=1;
				m=this.thang+1;
				y=this.nam;
			}
		} else {
			d=this.ngay+1;
			m=this.thang;
			y=this.nam;
		}
		tomorrow = new Date(d, m, y);
		return tomorrow;
	}
	public Date congNgay(int n) {
		int d=this.ngay, m=this.thang, y= this.nam;
		n= n-(lastMonth(m,y)-d);
		while(n>0) {
			m++;
			if(m>12) {
				m=1;
				y++;
			}
			n= n-lastMonth(m,y);
		}
		d = (lastMonth(m,y)-n)-lastMonth(m,y);
		Date newDate = new Date(d,m,y);
		return newDate;
	}
//======================================================================//
	public static void main(String[] args) {
		Date d = new Date(29, 2, 2000);
		System.out.println(d.Display());
	}	
}
