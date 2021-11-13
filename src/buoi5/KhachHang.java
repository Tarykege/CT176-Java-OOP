package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String cccd, hten, dchi;
	
	public KhachHang() {
		cccd = new String();
		hten = new String();
		dchi = new String();
	}
	public KhachHang(String c, String h, String d) {
		cccd = new String(c);
		hten = new String(h);
		dchi = new String(d);
	}
	
	public KhachHang(KhachHang k) {
		cccd = new String(k.cccd);
		hten = new String(k.hten);
		dchi = new String(k.dchi);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cccd");
		this.cccd = sc.nextLine();
		System.out.println("Nhap hten khach hang");
		this.hten = sc.nextLine();
		System.out.println("Nhap dchi");
		this.dchi = sc.nextLine();
		
	}
	
	public void in() {
		System.out.println("["+this.cccd+", "+this.hten+", "+this.dchi+"]");
	}
	public String toString() {
		return "["+this.cccd+", "+this.hten+", "+this.dchi+"]";
	}
	public float layTLeGiam(){
		return 0.0f;
	}
}
