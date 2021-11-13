package buoi5_2;

import java.util.Scanner;

public class HangHoa {
	private String mso,ten,nsxuat;
	
	public HangHoa() {
		this.mso = new String();
		this.ten = new String();
		this.nsxuat = new String();
	}
	public HangHoa(String m, String t, String n) {
		this.mso = new String(m);
		this.ten = new String(t);
		this.nsxuat = new String(n);
	} 
	public HangHoa(HangHoa h) {
		this.mso = new String(h.mso);
		this.ten = new String(h.ten);
		this.nsxuat = new String(h.nsxuat);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap ma so hang hoa");
		this.mso=sc.nextLine();
		System.out.println("\nNhap ten hang hoa");
		this.ten=sc.nextLine();
		System.out.println("\nNhap nha san xuat hang hoa");
		this.nsxuat=sc.nextLine();
	}
	public void in() {
		System.out.println("["+this.mso+", "+this.ten+", "+this.nsxuat+"]");
	}
	@Override
	public String toString() {
		return "["+this.mso+", "+this.ten+", "+this.nsxuat+"]";
	}
}
