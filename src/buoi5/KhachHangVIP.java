package buoi5;

import java.util.Scanner;

//Quan he thua ke
//Quan he gan ket
public class KhachHangVIP extends KhachHang {
	private float tLeGiam;
	private Date d; //quan he gan ket lop Date
	public KhachHangVIP() {
		super(); //goi ham xay dung lop cha
		this.tLeGiam =0.0f; //0.0 la double them f de ep kieu
		this.d = new Date();
	}
	public KhachHangVIP(KhachHang k, float t, Date n) {
		super(k);
		this.tLeGiam = t;
		this.d = new Date(n); //luu y khong nen gan tham chieu
	}
	public KhachHangVIP(KhachHangVIP k) {
		super(k);
		this.tLeGiam = k.tLeGiam;
		this.d = new Date(k.d);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap tLeGiam");
		this.tLeGiam = sc.nextFloat();
		System.out.println("\nNhap ngay tro thanh VIP");
		d.nhapNgay();
	}
	
	public void in() {
		super.in();
		System.out.println(", ti le giam"+this.tLeGiam+", ngay tro thanh VIP:"+d);
	}
	public String toSting() {
		return super.toString() + (", ti le giam"+this.tLeGiam+", ngay tro thanh VIP:"+d);
	}
	public float layTLeGiam(){
		return this.tLeGiam;
	}
}
