package buoi4_bai1;

import buoi2_bai1.Diem;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau A= new DiemMau(5,10,"Trang");
		System.out.println(A);
		
		DiemMau B= new DiemMau();
		B.nhap();
		B.doiDiem(10, 8);
		System.out.println(B);
		B.setMau("Vang");
		B.in();
	}
}
