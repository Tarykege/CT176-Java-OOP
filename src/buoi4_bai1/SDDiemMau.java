package buoi4_bai1;

import buoi2_bai1.Diem;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau A= new DiemMau(5,10,"Trang");
		System.out.println(A);
		
		DiemMau B= new DiemMau();
		System.out.println("Nhap diem B");
		B.nhap();
		
		System.out.println("Diem B sau khi doi (10,8) do");
		B.doiDiem(10, 8);
		System.out.println(B);
		
		System.out.println("Diem B sau khi doi mau vang");
		B.setMau("Vang");
		B.in();
	}
}
