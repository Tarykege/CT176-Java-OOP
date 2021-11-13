package buoi5_2;

import java.util.Scanner;

import buoi2.Date;
public class HoaDon {
	private String maSo, tieuDe, nhanVien, tenKhachHang;
	private Date ngayLap;
	private HangHoa hangHoa[];
	private int soLuong;
	
	public HoaDon() {
		this.maSo = new String();
		this.tieuDe = new String();
		this.nhanVien = new String();
		this.ngayLap = new Date();
		this.tenKhachHang = new String();
		this.soLuong = 0;
		this.hangHoa = new HangHoa[200];
	}
	public HoaDon(HoaDon h) {
		this.maSo = new String(h.maSo);
		this.tieuDe = new String(h.tieuDe);
		this.nhanVien = new String(h.nhanVien);
		this.ngayLap = new Date(h.ngayLap);
		this.tenKhachHang = new String(h.tenKhachHang);
		this.soLuong = h.soLuong;
		this.hangHoa = new HangHoa[h.hangHoa.length];
		for(int i=0 ;i<soLuong; i++) {
			this.hangHoa[i] = new HangHoa(h.hangHoa[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap ma so hoa don:");
		this.maSo = sc.nextLine();
		System.out.println("\n Nhap tieu de hoa don:");
		this.tieuDe = sc.nextLine();
		System.out.println("\n Nhap ten nhan vien");
		this.nhanVien = sc.nextLine();
		System.out.println("Nhap ngay lap hoa don");
		this.ngayLap.nhapNgay();
		System.out.println("Nhap ten khach hang");
		this.tenKhachHang = sc.nextLine();
		
		System.out.println("\n Nhap so luong hang hoa:");
		this.soLuong = sc.nextInt();
		sc.nextLine();
		for(int i=0 ;i<this.soLuong; i++) {
			this.hangHoa[i] = new HangHoa();
			hangHoa[i].nhap();
		}
	}
	public void in() {
		System.out.print("{"+this.maSo+", "+this.tieuDe+", "+this.nhanVien+", "+this.tenKhachHang+", "+this.ngayLap);
		for (int i=0; i<this.soLuong; i++) {
			System.out.print("\n- "+this.hangHoa[i]);
		}
		System.out.print("\n}");
	}
	public String toString() {
		String s =("{"+this.maSo+", "+this.tieuDe+", "+this.nhanVien+", "+this.tenKhachHang+", "+this.ngayLap);
		for (int i=0; i<this.soLuong; i++) {
			s+=("\n- "+this.hangHoa[i]);
		}
		s+=("\n}");
		return s;
	}
	public static void main(String[] args) {
		HoaDon hd = new HoaDon();
		hd.nhap();
		hd.in();
	}
}
