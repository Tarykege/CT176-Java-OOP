package buoi3;

import buoi2.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		DoanThang AB = new DoanThang(A, B);
		System.out.println("Toa do doan thang AB");
		AB.in();

		AB=AB.tinhTienDoanThang(5, 3);
		System.out.println("Toa do doan thang AB sau khi tinh tien (5,3) do");
		AB.in();
		
		DoanThang CD = new DoanThang();
		System.out.println("Nhap toa do doan thang CD");
		CD.nhapToaDoDoanThang();
		System.out.println("Toa do doan thang CD");
		CD.in();
		
		System.out.println("Goc cua CD so voi truc hoanh");
		System.out.println(CD.tinhGocTrucHoanh());
	}
}
