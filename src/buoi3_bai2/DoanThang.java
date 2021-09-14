package buoi3_bai2;

import java.util.Scanner;

import buoi2_bai1.Diem;

public class DoanThang {
	private Diem d1;
	private Diem d2;
	
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
//======================================================================//		
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
//======================================================================//		
	public void hienThi() {
		this.d1.hienThi();
		this.d2.hienThi();
	}
//======================================================================//		
	public void tinhTienDoanThang(int dx, int dy) {
		this.d1.doiDiem(dx, dy);
		this.d2.doiDiem(dx, dy);
	}
//======================================================================//		
	public float tinhDoDai() {
		//sqrt((ax-bx)^2+(ay-by)^2)
		return d1.khoangCach(d2);
	}
//======================================================================//
	public boolean checkTrungDiem() {
		if(this.d1.getX()==this.d2.getX() && this.d1.getY()==this.d2.getY() ) {
			return true;
		}
		else return false;
	}		
//======================================================================//
	public boolean checkDoiXung() {
		if(checkTrungDiem()) return false; 
		Diem absA = new Diem(Math.abs(this.d1.getX()),Math.abs(this.d1.getY()));
		Diem absB = new Diem(Math.abs(this.d2.getX()),Math.abs(this.d2.getY()));
		if(absA.getX()==absB.getX() && absA.getY()==absB.getY()) {
			return true;
		} 
		else return false;
	}
//======================================================================//
	public boolean checkDoiXungTrucX() {
		if(checkDoiXung()==true && this.d1.getX()*this.d2.getX()>0 ) {
			return true;
		}
		else return false;
	}
//======================================================================//	
	public boolean checkDoiXungTrucY() {
		
		if(checkDoiXung()==true && this.d1.getX()*this.d2.getX()<0 ) {
			return true;
		}
		else return false;
	}
//======================================================================//		
	public boolean checkSongSongTrucY() {
		if(checkDoiXung()) return false;
		if(this.d1.getX()==this.d2.getX()) return true;
		else return false;
	}
//======================================================================//	
	public boolean checkSongSongTrucX() {
		if(checkDoiXung()) return false;
		if(this.d1.getY()==this.d2.getY()) return true;
		else return false;
	}
//======================================================================//
	public float tinhGocTrucHoanh() {
		if(checkTrungDiem() || checkDoiXungTrucY() || checkSongSongTrucX()) return 0;
		if(checkDoiXungTrucX() || checkSongSongTrucY()) return 90;
		Diem o = new Diem(0,0);
		Diem a = new Diem(this.d1.getX(),0);
		Diem b = new Diem(0,this.d2.getY());
		
		if(d2.getY()==0 || d1.getX()==0){
			a = new Diem(this.d2.getX(),0);
			b = new Diem(0,this.d1.getY());
		}
		
		float oa= o.khoangCach(a);
		float ob= o.khoangCach(b);
		if(oa==0 || ob==0 ) return 0;
		
		float tiLe= ob/oa;
		float radian=(float) Math.atan(tiLe)  ;//radian= arctan(tiLe)
		float degrees=(float) Math.toDegrees(radian) ; //degress= radian*(180/pi)
		if(a.getX()*b.getY()>0) return 180-degrees;
		else return degrees;
	}
//======================================================================//		
	public static void main(String[] args) {
//		Diem a= new Diem(0,2);
//		Diem b= new Diem(0,1);
//		DoanThang d1 = new DoanThang(a,b);
//		System.out.println(d1.tinhGocTrucHoanh());
//		d1.hienThi();
	}
}
