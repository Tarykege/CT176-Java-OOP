package buoi2_bai3;

import java.util.Scanner;

public class PhanSo {
	int tu;
	int mau;
	public PhanSo() {
	}
//======================================================================//
	public PhanSo(int tu, int mau) {
		this.tu=tu;
		this.mau=mau;
	}
//======================================================================//
	public void nhapPhanSo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap tu:");
		this.tu = scanner.nextInt();
		System.out.print("Nhap mau:");
		this.mau = scanner.nextInt();
		while(this.mau==0) {
			System.out.print("Nhap lai mau:");
			this.mau = scanner.nextInt();
		}
		//scanner.close();
	}
//======================================================================//
	public void inPhanSo() {
		if(tu==0) System.out.println(tu);
		else if(mau==1) System.out.println(tu);
		else if(mau==-1) System.out.println(-tu);
		else if(mau<0) System.out.println(-tu+"/"+mau);
		else System.out.println(tu+"/"+mau);
	}
//======================================================================//
	public PhanSo giaTriNghichDao() {
		int tu = this.tu;
		int mau= this.mau;
		int temp =tu;
		tu=mau;
		mau=temp;
		PhanSo newPhanSo = new PhanSo(tu,mau);
		return newPhanSo;
	}
//======================================================================//
	public void nghichDao() {
		int temp=this.tu;
		this.tu=this.mau;
		this.mau=temp;
	}
//======================================================================//
	public double giaTriThuc() {
		double t = (double) this.tu/this.mau;
		return t;
	}
//======================================================================//
	public boolean lonHon(PhanSo a) {
		if(this.tu/this.mau>a.tu/a.mau)	return true;
		else return false;
	}
//======================================================================//
	public int bcnn(int a, int b) {
		int max = Math.max(a, b);
		int maxvalue=a*b;
		int value=0;
		for(int i=max; i<=maxvalue; i++) {
			if(i%a==0 && i%b==0) {
				value=i; 
				break;
			}
		}
		return value;
	}
//======================================================================//
	public int ucln(int a, int b) {
		int min = Math.max(a, b);
		int value=0;
		for(int i=min; i>1; i--) {
			if(a%i==0 && b%i==0) {
				value=i; 
			}
		}
		return value;
	}
//======================================================================//
	public PhanSo cong(PhanSo a) {
		int mauChung=bcnn(this.mau,a.mau);
		int mau=mauChung;
		int tu=(this.tu*(mauChung/this.mau))+ (a.tu*(mauChung/a.mau));
		//tu = tu/ucln(tu,mau);
		//mau=mau/ucln(tu,mau);
		PhanSo newPhanSo = new PhanSo(tu,mau);
		return newPhanSo;
	}
//======================================================================//
	public PhanSo tru(PhanSo a) {
		int mauChung=bcnn(this.mau,a.mau);
		int mau=mauChung;
		int tu=(this.tu*(mauChung/this.mau))-(a.tu*(mauChung/a.mau));
		//tu = tu/ucln(tu,mau);
		//mau=mau/ucln(tu,mau);
		PhanSo newPhanSo = new PhanSo(tu,mau);
		return newPhanSo;
	}
//======================================================================//
	public PhanSo nhan(PhanSo a) {
		int mau=this.mau*a.mau;
		int tu=this.tu*a.tu;
		PhanSo newPhanSo = new PhanSo(tu,mau);
		return newPhanSo;
	}
//======================================================================//
	public PhanSo chia(PhanSo a) {
		int mau=this.mau*a.tu;
		int tu=this.tu*a.mau;
		PhanSo newPhanSo = new PhanSo(tu,mau);
		return newPhanSo;
	}
	
}
