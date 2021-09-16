package buoi2_bai2;

import java.util.Scanner;

public class SDDate2 {
	public static void main(String[] args) {
		Date2 d = new Date2();
		d.input();
		System.out.println(d.toString());
		
		d=d.ngayHomSau();
		System.out.println(d.toString());
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ngay de cong: ");
		int n= scanner.nextInt();
		d=d.congNgay(n);
		System.out.println(d.toString());
	}
}