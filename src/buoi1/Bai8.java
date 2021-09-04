package buoi1;

import java.util.Scanner;

public class Bai8 {
	public static void show(int[] a) {
		System.out.print("Danh sach: ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static int countX(int x, int[] a) {
		int c=0;
		for (int i=0; i<a.length; i++) {
				if (a[i]==x) c++; 
		}
		return c;
	}
	public static void sort(int[] a) {
		for (int i=0; i<a.length-1; i++) {
			for (int j=i; j<a.length; j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong:");
		int n = scanner.nextInt();
		int a[]= new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Nhap phan tu a["+i+"]: ");
			a[i]=scanner.nextInt();
		}
		System.out.print("nhap so can tim kiem: ");
		int x = scanner.nextInt();
		System.out.println(x+" co so luong la: "+countX(x,a));
		sort(a);
		show(a);
	}
}
