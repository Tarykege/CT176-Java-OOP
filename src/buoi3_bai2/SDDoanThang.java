package buoi3_bai2;

import buoi2_bai1.Diem;

public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,35);
		DoanThang AB = new DoanThang(A,B);
		System.out.println("Toa do doan thang AB");
		AB.inDoanThang();

		AB=AB.tinhTienDoanThang(5, 3);
		System.out.println("Toa do doan thang AB sau khi tinh tien (5,3)");
		AB.inDoanThang();
		
		DoanThang CD = new DoanThang();
		System.out.println("Nhap toa do doan thang CD");
		CD.nhapToaDoDoanThang();
		System.out.println("Toa do doan thang CD");
		CD.inDoanThang();
		
		System.out.println("Goc cua CD so voi truc hoanh");
		System.out.println(CD.tinhGocTrucHoanh());
	}
}
