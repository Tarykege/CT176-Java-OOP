package buoi2_bai3;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a= new PhanSo(3,7);
		PhanSo b= new PhanSo(4,9);
		a.inPhanSo();
		b.inPhanSo();
//======================================================================//
		PhanSo x= new PhanSo();
		PhanSo y= new PhanSo();
		System.out.println("Nhap phan so x");
		x.nhapPhanSo();
		System.out.println("Nhap phan so y");
		y.nhapPhanSo();
//======================================================================//
		System.out.print("Nghich dao cua x: ");
		PhanSo daoX = x.giaTriNghichDao();
		daoX.inPhanSo();
//======================================================================//
		System.out.print("x+y= ");
		PhanSo z = x.cong(y);
		z.inPhanSo();
//======================================================================//
		System.out.print("x*y= ");
		z = x.nhan(y);
		z.inPhanSo();
//======================================================================//
		System.out.print("x/y= ");
		z = x.chia(y);
		z.inPhanSo();
//======================================================================//		
		System.out.print("Nhap so luong phan so: ");
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		PhanSo[] c = new PhanSo[n];
		for (int i=0; i<c.length; i++) {
			PhanSo ps= new PhanSo();
			System.out.println("Nhap phan so thu "+(i+1));
			ps.nhapPhanSo();
			c[i]=ps;
		}
//======================================================================//
		double max= Double.MIN_VALUE;
		for (int i=0; i<n; i++) {
			if(max<c[i].giaTriThuc()) 
				max=c[i].giaTriThuc();
		}
		System.out.println("Max: "+Math.ceil(max*100)/100);
//======================================================================//
		PhanSo sum = new PhanSo(0,1);
		System.out.println("Sum all");
		for(int i=0 ; i<n; i++) {
			sum=sum.cong(c[i]);
		}
		sum.inPhanSo();
//======================================================================//
		System.out.println("Ascending order");
		for (int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(c[i].giaTriThuc()>c[j].giaTriThuc()) {
					PhanSo temp = c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for (int i=0; i<n; i++) {
			c[i].inPhanSo();
		}
	}
}
