package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private int sluong;
	private float dgia;
	private HangHoa h;
	
	public ChiTiet() {
		this.h = new HangHoa();
		this.sluong = 0;
		this.dgia = 0.0f;
	}
	public ChiTiet(int s, float d, HangHoa h1) {
		this.h = new HangHoa(h1);
		this.sluong = s;
		this.dgia = d;
	}
	public ChiTiet(ChiTiet c) {
		this.h = new HangHoa(c.h);
		this.sluong = c.sluong;
		this.dgia = c.dgia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap thong tin hang hoa");
		this.h.nhap();
		System.out.println("\nNhap sluong");
		this.sluong=sc.nextInt();
		System.out.println("\nNhap dgia");
		this.dgia=sc.nextFloat();
	}
	public void in() {
//		this.h.in();
		System.out.println(h + ", so luong: " + this.sluong+", don gia:" + this.dgia);
		
	}
	@Override
	public String toString() {
		return h + ", so luong: " + this.sluong+", don gia:" + this.dgia;
	}
	
	public int laySLuong() {
		return sluong;
	}
	public float layDGia() {
		return dgia;
	}
}
