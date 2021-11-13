package buoi4;

import java.util.Scanner;

import buoi2.Diem;

public class DiemMau extends Diem {
	private String mau;
	
//======================================================================//
	public DiemMau() {
		super();
	}
	
	public DiemMau(int x, int y, String mau) {
		super(x,y);
		this.mau= mau;
	}
	
	public DiemMau(Diem d, String mau) {
		super(d);
		this.mau=mau;
	}
	
	public DiemMau(DiemMau obj) {
		super(obj);
		this.mau= new String(obj.mau);
	}
//======================================================================//
	public void setMau(String mau) {
		this.mau = mau;
	}
	public String getMau() {
		return mau;
	}
//======================================================================//
	public void nhap() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap diem");
		super.nhapDiem();
		System.out.print("Nhap mau: ");
		this.mau= scanner.nextLine();
	}
//======================================================================//
	public void in() {
		System.out.print("Toa do ");
		super.inDiem();
		System.out.print(", mau: "+this.mau);
	}
	public String toString() {
		return "Toa do "+super.toString()+", mau: "+this.mau; 
	};
	
}
