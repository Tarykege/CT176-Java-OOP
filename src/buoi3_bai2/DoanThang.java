package buoi3_bai2;

import java.util.Scanner;

import buoi2_bai1.Diem;

public class DoanThang {
	Diem d1,d2;
	public DoanThang() {
		this.d1= new Diem();
		this.d2= new Diem();
	}
	
	public DoanThang(Diem d1, Diem d2) {
		this.d1=d1;
		this.d2=d2;
	}
	
	public DoanThang(int ax, int ay, int bx, int by) {
		this.d1= new Diem(ax,ay);
		this.d2= new Diem(bx,by);
	}
	
	public void nhapToaDo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap diem A");
		System.out.print("nhap Ax: ");
		int ax= scanner.nextInt();
		this.d1.setX(ax);
		System.out.print("nhap Ay: ");
		int ay= scanner.nextInt();
		this.d1.setY(ay);
		
		System.out.println("Nhap diem B");
		System.out.print("nhap Bx: ");
		int bx= scanner.nextInt();	
		this.d2.setX(bx);
		System.out.print("nhap By: ");
		int by= scanner.nextInt();
		this.d2.setY(by);
	}
	
	public void hienThi() {
		this.d1.hienThi();
		this.d2.hienThi();
	}
	
	public void tinhTienDoanThang(int dx, int dy) {
		this.d1.doiDiem(dx, dy);
		this.d2.doiDiem(dx, dy);
	}
	
	public float tinhDoDai() {
		//sqrt((ax-bx)^2+(ay-by)^2)
		return d1.khoangCach(d2);
	}
	
//	public float tinhGocTrucHoanh() {
//		Diem o = new Diem(0,0);
//		DoanThang od1= new (o,)
//		DoanThang od2= new (o);
//		return 0;
//	}
	public static void main(String[] args) {
//		Diem a= new Diem(3,2);
//		Diem b= new Diem(4,5);
//		DoanThang d1 = new DoanThang(a,b);
//		d1.tinhTienDoanThang(1, 1);
//		d1.hienThi();
//		System.out.println(d1.tinhDoDai());
	}
}
