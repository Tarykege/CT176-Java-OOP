package buoi3_bai1;

import java.util.Scanner;

public class Gach {
	String maSo;
	String mau;
	int soLuongVien,chieuDai,chieuRong;
	long giaBan;
	Gach(){}
	void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		String maSo= scanner.nextLine();
		this.maSo=maSo;
		System.out.print("Nhap mau: ");
		String mau= scanner.nextLine();
		this.mau=mau;
		System.out.print("Nhap so luong vien trong hop: ");
		int soLuongVien= scanner.nextInt();
		this.soLuongVien=soLuongVien;
		System.out.print("Nhap chieu dai 1 vien gach (cm): ");
		int chieuDai= scanner.nextInt();
		this.chieuDai=chieuDai;
		System.out.print("Nhap chieu rong 1 vien gach (cm): ");
		int chieuRong= scanner.nextInt();
		this.chieuRong=chieuRong;
		System.out.print("gia ban/hop: ");
		long giaBan= scanner.nextInt();
		this.giaBan=giaBan;
	}
	
	String hienThiThongTin() {
		return this.maSo+" - "+this.mau+" - "+this.soLuongVien+" - "+this.chieuDai+"cm"+" - "+this.chieuRong+"cm"+" - "+this.giaBan;
	}
	
	float giaBanLe() {
		float cost= (this.giaBan*20/100)/this.soLuongVien;
		     cost+=(this.giaBan/this.soLuongVien);
		return cost;
	}
	
	float dienTichNenToiDa() {
		//lay dien tich cua 1 vien * so luong 1 hop (cm2)
		long cm2=this.chieuDai*this.chieuRong*this.soLuongVien;
		double m2=cm2*Math.pow(10, -3);
		return (float) m2;
	}
	
	double soLuongLot(double D, double N) {
		//dien tich D*N / dien tich 1 vien gach (m2)
		double sYeuCau=D*N;
		double sGach=(this.chieuDai*this.chieuRong)*Math.pow(10, -3);
		return sYeuCau/sGach;
	}
	
	//overload
	double soLuongLot(double D, int N) {
		//dien tich D*N / dien tich 1 vien gach (m2)
		double sYeuCau=D*N;
		double sGach=(this.chieuDai*this.chieuRong)*Math.pow(10, -3);
		return sYeuCau/sGach;
	}
	
	//overload
	double soLuongLot(int D, int N) {
		//dien tich D*N / dien tich 1 vien gach (m2)
		double sYeuCau=D*N;
		double sGach=(this.chieuDai*this.chieuRong)*Math.pow(10, -3);
		return sYeuCau/sGach;
	}
	
	//overload
	double soLuongLot(int D, double N) {
		//dien tich D*N / dien tich 1 vien gach (m2)
		double sYeuCau=D*N;
		double sGach=(this.chieuDai*this.chieuRong)*Math.pow(10, -3);
		return sYeuCau/sGach;
	}
	public static void main(String[] args) {
//		Gach gach= new Gach();
//		gach.nhapThongTin();
//		System.out.println(gach.hienThiThongTin());
//		System.out.println(gach.giaBanLe());
//		System.out.println(gach.dienTichNenToiDa());
//		System.out.println(Math.ceil(gach.soLuongLot(14.7, 2)));
	}
}
