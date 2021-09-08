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
		if(this.ngay>lastMonth(this.thang,this.nam) || this.ngay < 1) 
			return false; else return true;
	}
//======================================================================//
	public Date ngayHomSau() {
		Date tomorrow;
		int d=this.ngay,m=this.thang,y=this.nam;
		
		if(hopLe()) {
			if(d==lastMonth(m,y)) {
				if(m==12) {
					d=1;
					m=1;
					y+=1;
				} else {
					d=1;
					m+=1;
					//y=this.nam;
				}
			} else {
				d+=1;
				//m=this.thang;
				//y=this.nam;
			}			
		}
		return tomorrow = new Date(d, m, y);
	}
//======================================================================//	
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
		Date d = new Date(2, 12, 2001);
		d=d.ngayHomSau();
		System.out.println(d.toString());
	}	
}
