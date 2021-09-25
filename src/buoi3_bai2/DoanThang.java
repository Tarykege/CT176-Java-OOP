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
		this.d1=new Diem(d1);
		this.d2=new Diem(d2);
	}
	
	public DoanThang(DoanThang obj) {
		this.d1=new Diem(obj.d1);
		this.d2=new Diem(obj.d2);
	}
	
	public DoanThang(int ax, int ay, int bx, int by) {
		this.d1= new Diem(ax,ay);
		this.d2= new Diem(bx,by);
	}
//======================================================================//		
	public void nhapToaDoDoanThang() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap diem d1");
		this.d1.nhapDiem();
		System.out.println("Nhap diem d2");
		this.d2.nhapDiem();
	}
//======================================================================//		
	public void inDoanThang() {
		this.d1.inDiem();
		this.d2.inDiem();
	}
	@Override
	public String toString() {
		return d1+", "+d2;
	}
//======================================================================//		
	public DoanThang tinhTienDoanThang(int dx, int dy) {
		DoanThang doanThang= new DoanThang(d1,d2);
		doanThang.d1.doiDiem(dx, dy);
		doanThang.d2.doiDiem(dx, dy);
		return doanThang;
	}
//======================================================================//		
	public float tinhDoDai() {
		//sqrt((ax-bx)^2+(ay-by)^2)
		return d1.khoangCach(d2);
	}
//======================================================================//
	public boolean checkTrungDiem() {
		if(this.d1.layX()==this.d2.layX() && this.d1.layY()==this.d2.layY() ) {
			return true;
		}
		else return false;
	}		
//======================================================================//		
	public boolean checkSongSongTrucY() {
		if(checkTrungDiem()) return false;
		if(this.d1.layX()==this.d2.layX()) return true;
		else return false;
	}
//======================================================================//	
	public boolean checkSongSongTrucX() {
		if(checkTrungDiem()) return false;
		if(this.d1.layY()==this.d2.layY()) return true;
		else return false;
	}
//======================================================================//
	public float tinhGocTrucHoanh() {
		if(checkTrungDiem() || checkSongSongTrucX()) return 0;
		if(checkSongSongTrucY()) return 90;
		Diem o = new Diem(0,0);
		Diem a = new Diem(this.d1.layX(),0); //d1(x,0)
		Diem b = new Diem(0,this.d2.layY()); //d2(0,y)
		
		if(d2.layY()==0 || d1.layX()==0){
			int d2X=this.d2.layX();
			int d1Y=this.d1.layY();
			a = new Diem(d2X,0); //d2(x,0)
			b = new Diem(0,d1Y); //d1(0,y)
		}
		DoanThang oa= new DoanThang(o,a);
		DoanThang ob= new DoanThang(o,b);
		float kcOA= oa.tinhDoDai();
		float kcOB= ob.tinhDoDai();
		if(kcOA==0 || kcOB==0 ) return 0;
		
		float tiLe= kcOB/kcOA;
		float radian=(float) Math.atan(tiLe)  ;//radian= arctan(tiLe)
		float degrees=(float) Math.toDegrees(radian) ; //degress= radian*(180/pi)
		if(a.layX()*b.layY()>0) return 180-degrees;
		else return degrees;
	}
//======================================================================//		
//	public static void main(String[] args) {
//		Diem a= new Diem(5,2);
//		Diem b= new Diem(2,1);
//		DoanThang d1 = new DoanThang(a,b);
//		System.out.println(d1.tinhGocTrucHoanh());
//		System.out.println("doan thang d1: "+d1);
//	}
}
