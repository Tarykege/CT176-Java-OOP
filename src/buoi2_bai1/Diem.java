package buoi2_bai1;

import java.util.Scanner;

public class Diem {
	private int x;
	private int y;
	
//======================================================================//
	public Diem(){
		this.x=0;
		this.y=0;
	}
	public Diem(int x, int y){
		this.x = x;
		this.y = y;
	}
//======================================================================//
	public int layX() {
		return this.x;
	}
	
	public int layY() {
		return this.y;
	}
	
	public void datX(int x) {
		this.x= x;
	}
	
	public void datY(int y) {
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
	public void inDiem() {
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
		return (float) Math.sqrt(this.x*this.x+this.y*this.y);
	}
//===============================Overload===============================//
	public float khoangCach(Diem d){
		return (float) Math.sqrt((d.layX()-this.x)*(d.layX()-this.x)+(d.layY()-this.y)*(d.layY()-this.y));
	}
}

