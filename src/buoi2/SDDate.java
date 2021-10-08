package buoi2;

import java.util.Scanner;

public class SDDate {
	public static void main(String[] args) {
		Date d = new Date();
		d.nhapNgay();
		System.out.println("Hien thi ngay");
		System.out.println(d.toString());
		
		System.out.println("Hien thi ngay hom sau");
		d=d.ngayHomSau();
		System.out.println(d.toString());
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ngay de cong: ");
		int n= scanner.nextInt();
		d=d.congNgay(n);
		System.out.println(d.toString());
	}
}