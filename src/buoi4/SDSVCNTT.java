package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSVCNTT {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so luong SV CNTT: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		SinhVien[] dsSV = new SinhVien[n];
		
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Nhap 1 de nhap sinh vien 2 de nhap sinh vien CNTT");	
			int c = scanner.nextInt();
			scanner.nextLine();
			if(c == 1) {
				dsSV[i]= new SinhVien();
			}
			else if(c==2) {
				dsSV[i]= new SVCNTT();
			}
			System.out.println("Nhap thong tin sinh vien thu "+(i+1));
			dsSV[i].nhap();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Nhap mon va diem sinh vien thu "+(i+1));
			dsSV[i].nhapDiemHocPhan();
		}
		
		System.out.println("In danh sach sinh vien CNTT");
		for (SinhVien sv : dsSV) {
			System.out.println(sv);
		}
		
		String timTK = new String();
		boolean found=false;
		System.out.print("Nhap ten tai khoan email can tim: ");
		timTK= scanner.nextLine();
		for(int i=0; i<n; i++) {
			if(dsSV[i].getEmail().compareToIgnoreCase(timTK)==0) {
				System.out.println("Thong tin sinh vien tim duoc");
				System.out.println(dsSV[i]+", diemTB: "+dsSV[i].diemTB4());
				found=true;
				break;
			}
		}
		if(!found) System.out.println("Khong tim duoc sinh vien co tai khoan email nay!");
		
		System.out.println("Sap xep theo diem TB");
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(dsSV[i].diemTB4()>dsSV[j].diemTB4()) {
					SinhVien t = dsSV[i];
					dsSV[i] = dsSV[j];
					dsSV[j] = t;
				}
			}
		}
		for (SinhVien sv : dsSV) {
			System.out.println(sv+", diemTB: "+sv.diemTB4());
		}
		
	}
}
