package buoi1;

import java.util.Scanner;

public class Bai6 {
	public static boolean primeNumber(int x) {
		if (x<=1) return false;
		else {
			for(int i=2; i<Math.sqrt(x); i++ ) {
				if (x%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.print("Nhap so nguyen: ");
		int x = scanner.nextInt();
		scanner.close();
		if (primeNumber(x)) {
			System.out.println(x+" la so nguyen to.");
		}
		else System.out.println(x+" khong phai la so nguyen to.");
		System.out.println("Dang nhi phan: "+Integer.toBinaryString(x));
	}

}

