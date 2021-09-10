package buoi3_bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		SinhVien a= new SinhVien();
		a.nhapSV();
		a.nhapDiemHocPhan();
		a.dangKyHocPhan();
		
		Scanner scanner = new Scanner(System.in);
		List<SinhVien> dsSv = new ArrayList<SinhVien>();
		
		System.out.print("Nhap so sinh vien:");
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			SinhVien sv = new SinhVien();
			System.out.println("Nhap sinh vien thu "+(i+1));
			sv.nhapSV();
			sv.nhapDiemHocPhan();
			dsSv.add(sv);
			System.out.println();
		}
		
		System.out.println("Sinh vien canh bao hoc vu: ");
		for (SinhVien sinhVien : dsSv) {
			if(sinhVien.diemTB4()<2.5) {
				System.out.println(sinhVien.toString());
			}
		}
		
		System.out.println("Sinh vien co diem tb cao nhat lop la: ");
		float max=-1;
		SinhVien highestSv= new SinhVien();
		for (SinhVien sinhVien : dsSv) {
			if(sinhVien.diemTB4()>max) {
				max= sinhVien.diemTB4();
				highestSv=sinhVien;
			}
		}
		System.out.println(highestSv.toString());
		
		Collections.sort(dsSv);
		for (SinhVien sinhVien : dsSv) {
			System.out.println(sinhVien.toString());
		}
	}
}
