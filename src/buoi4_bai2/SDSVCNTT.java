package buoi4_bai2;

import java.util.Scanner;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so luong SV CNTT: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		SVCNTT[] dsSVCNTT = new SVCNTT[n];
		
		for(int i=0; i<n; i++) dsSVCNTT[i] = new SVCNTT();
		for(int i=0; i<n; i++) {
			System.out.println("Nhap thong tin sinh vien thu "+(i+1));
			dsSVCNTT[i].nhap();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Nhap mon va diem sinh vien thu "+(i+1));
			dsSVCNTT[i].nhapDiemHocPhan();
		}
		
		System.out.println("In danh sach sinh vien CNTT");
		for (SVCNTT svcntt : dsSVCNTT) {
			System.out.println(svcntt);
		}
		
		String timTK = new String();
		boolean found=false;
		System.out.print("Nhap ten tai khoan email can tim: ");
		timTK= scanner.nextLine();
		for(int i=0; i<n; i++) {
			if(dsSVCNTT[i].getEmail().compareToIgnoreCase(timTK)==0) {
				System.out.println("Thong tin sinh vien tim duoc");
				System.out.println(dsSVCNTT[i]+", diemTB: "+dsSVCNTT[i].diemTB4());
				found=true;
				break;
			}
		}
		if(!found) System.out.println("Khong tim duoc sinh vien co tai khoan email nay!");
	}
}
