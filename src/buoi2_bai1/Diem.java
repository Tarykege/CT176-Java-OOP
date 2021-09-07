package buoi2_bai1;

import java.util.Scanner;

public class Diem {
	int x;
	int y;
	public Diem(){
		this.x=0;
		this.y=0;
	}
	
	public Diem(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int giaTriX() {
		return this.x;
	}
	
	public int giaTriY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x= x;
	}
	
	public void setY(int y) {
		this.y= y;
	}
//======================================================================//
	public void nhapDiem() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap toa do x: ");
		this.x=scanner.nextInt();
		System.out.print("Nhap toa do y: ");
		this.y=scanner.nextInt();
		scanner.close();
	}
//======================================================================//
	public void hienThi() {
      //System.out.printf("(%d,%d)\n",this.x,this.y);
		System.out.println("("+this.x+","+this.y+")");
	}
//======================================================================//
	public void doiDiem(int dx, int dy) {
		this.x+=dx;
		this.y+=dy;
	}
//======================================================================//
	public float khoangCach() {
		float k= (float) Math.sqrt(this.x*this.x+this.y*this.y);
		return k;
	}
//======================================================================//
	public float khoangCach(Diem d){
		float k= (float) Math.sqrt((d.x-this.x)*(d.x-this.x)+(d.y-this.y)*(d.y-this.y));
		return k;
	}
//======================================================================//
	public static void main(String[] args) {
		
	}
}

