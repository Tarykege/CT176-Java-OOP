package buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinhVien a= new SinhVien();
		a.nhap();
		a.nhapDiemHocPhan();
		a.dangKyHocPhan();
		System.out.println(a);
		
		System.out.print("Nhap so luong sinh vien: ");
		int n= scanner.nextInt();
		SinhVien sinhViens[]= new SinhVien[n];
		//nhap thong tin sv
		for(int i=0; i<n; i++) {
			System.out.println("Nhap sinh vien thu "+(i+1));
			sinhViens[i]= new SinhVien();
			sinhViens[i].nhap();
			
		}
		//nhap diem
		for(int i=0; i<n; i++) {
			System.out.println("Nhap diem sinh vien thu "+(i+1));
			sinhViens[i].nhapDiemHocPhan();
		}
		//in danh sach
		for (SinhVien sinhVien : sinhViens) {
			System.out.println(sinhVien.toString());
		}
		
		System.out.println("SV Canh bao hoc vu");
		boolean found=false;
		for(int i=0; i<n; i++) {
			if(sinhViens[i].diemTB4()<=1.0) {
				found=true;
				System.out.println(sinhViens[i].toString()+" Diem TB: "+sinhViens[i].diemTB4());
			}
		}
		if(!found) System.out.println("Khong co sv bi canh bao hoc vu");
		
		System.out.println("SV diem trung binh cao nhat lop");
		float maxD= -Float.MAX_VALUE;
		SinhVien sinhVienMax = new SinhVien();
		for(int i=0; i<n; i++) {
			if(sinhViens[i].diemTB4()>maxD) {
				maxD=sinhViens[i].diemTB4();
				sinhVienMax= new SinhVien(sinhViens[i]);
			}
		}
		System.out.println(sinhVienMax.toString()+" Diem TB: "+sinhVienMax.diemTB4());
		
		System.out.println("Sort by name");
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(sinhViens[i].getTen().compareTo(sinhViens[j].getTen())>0) {
					SinhVien temp = sinhViens[i];
					sinhViens[i]=sinhViens[j];
					sinhViens[j]=temp;
				}
			}
		}
		for (SinhVien sinhVien : sinhViens) {
			System.out.println(sinhVien.toString()+" Diem TB: "+sinhVien.diemTB4());
		}
	}
}
