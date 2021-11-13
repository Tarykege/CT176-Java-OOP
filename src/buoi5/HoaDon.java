package buoi5;


import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien; 
	private Date nlap; 
	private KhachHang k; 
	private ChiTiet c[];
	private int sl;
	public HoaDon() {
		this.mso = new String();
		this.tde = new String(); 
		this.nvien = new String();
		this.nlap = new Date();
		this.k = new KhachHang();
		this.c = new ChiTiet[20]; 
		this.sl = 0;
		
	}
	public HoaDon(HoaDon h) {
		this.mso = new String(h.mso);
		this.tde = new String(h.tde); 
		this.nvien = new String(h.nvien);
		this.nlap = new Date(h.nlap);
		this.k = new KhachHang(h.k);
		this.c = new ChiTiet[h.c.length]; 
		this.sl = h.sl; 
		for(int i=0 ;i<sl; i++) {
			this.c[i] = new ChiTiet(h.c[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap ma so hoa don:");
		this.mso = sc.nextLine();
		System.out.println("\n Nhap tieu de hoa don:");
		this.tde = sc.nextLine();
		System.out.println("\n Nhap ten nhan vien lap hoa don:");
		this.nvien = sc.nextLine();
		
		System.out.println("\n Nhap ngay lap hoa don:");
		this.nlap.nhapNgay();
		
		int select=0;
		System.out.println("\n Nhap thong tin khach hang (0) hay khach hang VIP (1)");
		select = sc.nextInt();
		if(select==0) this.k = new KhachHang();
		else this.k = new KhachHangVIP();
		this.k.nhap(); 
		
		
		System.out.println("\n Nhap so luong chi tiet cua hang hoa:");
		this.sl = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<this.sl; i++) {
			System.out.println("\nNhap chi tiet thu "+ (i+1)+": ");
			c[i] = new ChiTiet();
			c[i].nhap();
		}
		
	}
	public void in() {
		System.out.println("{"+ this.mso+", "+this.tde+"\n Nguoi lap hoa don: "+this.nvien+"\n Ngay lap:"+this.nlap+"\n Khachhang: "+this.k);
		System.out.println("\nCac chi tiet hoa don: ");
		for(int i=0; i<sl; i++) {
			System.out.println("\n +: "+(i+1)+c[i]);
		}
		System.out.println("\n Tong so tien:"+tong());
	}
	@Override
	public String toString() {
		String s = ("{"+ this.mso+", "+this.tde+"\n Nguoi lap hoa don: "+this.nvien+"\n Ngay la:"+this.nlap+"\n Khachhang: "+this.k);
		s += ("\nCac chi tiet hoa don: ");
		for(int i=0; i<sl; i++) {
			s+= ("\n +: "+(i+1)+c[i]);
			s+=("\n Tong so tien:"+tong());
		}
		return s;
	}
	public float tong() {
		float t = 0.0f;
		for(int i=0; i<this.sl; i++) {
			t+= c[i].laySLuong() * c[i].layDGia(); 
		}
		t = t - t*k.layTLeGiam(); 
		return t;
	}
}
