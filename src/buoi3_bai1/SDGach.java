package buoi3_bai1;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so loai gach: ");
		int n= scanner.nextInt();
		Gach[] dsGach = new Gach[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Loai "+(i+1));
			dsGach[i]= new Gach();
			dsGach[i].nhapThongTin();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Loai "+i+": {"+dsGach[i].toString()+"}");
		}
		
		float min=Float.MAX_VALUE;
		int p=0;
		for(int i=0; i<n; i++) {
			if(dsGach[i].giaBanLe()<min) {
				min=dsGach[i].giaBanLe();
				p=i;
			}
		}
		System.out.println("gach chi phi lot thap nhat: {"+dsGach[p].toString()+"}");
		
		//gia ban 1 hop * so luong hop lot toi da 
		for(int i=0; i<n; i++) {
			System.out.println("chi phi mua gach loai "+(i+1)+": "+dsGach[i].soLuongHop(20, 5)*dsGach[i].getGiaBan());
		}
	}
}
