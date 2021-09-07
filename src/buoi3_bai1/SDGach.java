package buoi3_bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap danh sach loai gach: ");
		int n= scanner.nextInt();
		List<Gach> gachs = new ArrayList<Gach>();
		for(int i=0; i<n; i++) {
			Gach gach= new Gach();
			System.out.println("Nhap loai "+(i+1)+" ");
			gach.nhapThongTin();
			gachs.add(gach);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Loai "+i+": "+gachs.get(i).hienThiThongTin());
		}
		
		float min=Float.MAX_VALUE;
		int p=0;
		for(int i=0; i<n; i++) {
			if(gachs.get(i).giaBanLe()<min) {
				min=gachs.get(i).giaBanLe();
				p=i;
			}
		}
		System.out.println("gach chi phi lot thap nhat: "+gachs.get(p).hienThiThongTin());
		
		//gia ban le * so luong lot toi da 
		for(int i=0; i<n; i++) {
//			System.out.println(gachs.get(i).giaBanLe());
//			System.out.println(Math.ceil(gachs.get(i).soLuongLot(20, 5)));
			System.out.println("chi phi mua gach: "+gachs.get(i).giaBanLe()*Math.ceil(gachs.get(i).soLuongLot(20, 5)));
		}
	}
}
