package buoi3_bai1;

import java.util.Scanner;

public class Gach {
	private String maSo;
	private String mau;
	private int soLuongVien,chieuDai,chieuRong;
	private long giaBan;

//======================================================================//
	Gach(){
		this.maSo=new String();
		this.mau= new String();
		this.soLuongVien=0;
		this.chieuDai=0;
		this.chieuRong=0;
		this.giaBan=0;
	}
	Gach(String maSo, String mau, int soLuongVien, int chieuDai, int chieuRong, long giaBan){
		this.maSo=maSo;
		this.mau=mau;
		this.soLuongVien=soLuongVien;
		this.chieuDai=chieuDai;
		this.chieuRong=chieuRong;
		this.giaBan=giaBan;
	}
	Gach(Gach obj){
		this.maSo=obj.maSo;
		this.mau=obj.mau;
		this.soLuongVien=obj.soLuongVien;
		this.chieuDai=obj.chieuDai;
		this.chieuRong=obj.chieuRong;
		this.giaBan=obj.giaBan;
	}
//======================================================================//
	public String getMaSo() {
		return maSo;
	}
	public String getMau() {
		return mau;
	}
	public int getSoLuongVien() {
		return soLuongVien;
	}
	public int getChieuDai() {
		return chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public long getGiaBan() {
		return giaBan;
	}
//======================================================================//
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public void setMau(String mau) {
		this.mau = mau;
	}
	public void setSoLuongVien(int soLuongVien) {
		this.soLuongVien = soLuongVien;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
//======================================================================//	
	void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		this.maSo= scanner.nextLine();
		System.out.print("Nhap mau: ");
		this.mau= scanner.nextLine();
		System.out.print("Nhap so luong vien trong hop: ");
		this.soLuongVien= scanner.nextInt();
		System.out.print("Nhap chieu dai 1 vien gach (cm): ");
		this.chieuDai= scanner.nextInt();
		System.out.print("Nhap chieu rong 1 vien gach (cm): ");
		this.chieuRong= scanner.nextInt();
		System.out.print("gia ban/hop: ");
		this.giaBan= scanner.nextInt();
	}
	
	@Override
	public String toString() {
		return "Ma so: "+this.maSo+"; "+"Mau: "+this.mau+"; "+"So luong vien: "+this.soLuongVien+"; "+"Dai: "+this.chieuDai+"cm"+"; "+"Rong: "+this.chieuRong+"cm"+"; "+"Gia/hop: "+this.giaBan;
	}
	
	float giaBanLe() {
		return (this.giaBan/this.soLuongVien)+(this.giaBan/this.soLuongVien)*((float)20/100);
	}
//======================================================================//
	int dienTichNenToiDa() {
		return this.chieuDai*this.chieuRong*this.soLuongVien; //dien tich 1 vien * so luong 1 hop (cm2)
	}
//======================================================================//
	int soLuongHop(int D, int N) {
		Gach gach = new Gach(this.maSo,this.mau,this.soLuongVien,this.chieuDai,this.chieuRong,this.getGiaBan());
		Double sMax=gach.dienTichNenToiDa()*Math.pow(10,-4); //cm2 -> m2
		return (int)Math.ceil(D*N/sMax); //dien tich D*N / dien tich 1 hop gach (m2)
	}
//======================================================================//
	public static void main(String[] args) {
		Gach gach= new Gach();
		gach.nhapThongTin();
		System.out.println(gach);
		System.out.println(gach.giaBanLe());
		System.out.println(gach.chieuDai*gach.chieuRong);
		System.out.println(gach.dienTichNenToiDa()*Math.pow(10,-4));
		System.out.println(gach.soLuongHop(4,5));
	}
}
