package buoi4;

import java.util.Scanner;

public class ConVat {
	private String giong;
	private String mauLong;
	private String canNang;
	
	//======================================================================//
	public ConVat(){
		this.giong = new String();
		this.mauLong = new String();
		this.canNang = new String();
	}
	public ConVat(String giong, String mauLong, String canNang ){
		this.giong = new String(giong);
		this.mauLong = new String(mauLong);
		this.canNang = new String(canNang);
	}
	public ConVat(ConVat obj) {
		this.giong = new String(obj.giong);
		this.mauLong = new String(obj.mauLong);
		this.canNang = new String(obj.canNang);
	}
	//======================================================================//
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten giong: ");
		this.giong = sc.nextLine();
		System.out.print("Nhap mau long: ");
		this.mauLong = sc.nextLine();
		System.out.print("Nhap can nang: ");
		this.canNang = sc.nextLine();
	}
	
	//======================================================================//
	public void keu() {
		
	}
	//======================================================================//
	public static void main(String[] args) {
		
	}
}
