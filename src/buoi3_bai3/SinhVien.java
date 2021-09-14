package buoi3_bai3;

import java.util.Scanner;

import buoi2_bai2.Date;

public class SinhVien implements Comparable<SinhVien>{
	String mssv;
	String hoTen;
	Date ngaySinh;
	int soHocPhan;
	String[] dsHocPhan;
	String[] diemHocPhan;

//======================================================================//
	public SinhVien() {
		this.diemHocPhan=new String[100];
		for (String string : diemHocPhan) {
			string=null;
		}
		
		this.dsHocPhan= new String[100];
		for (String string : dsHocPhan) {
			string=null;
		}
	}
	
	public SinhVien(String mssv, String hoTen, Date ngaySinh, int soHocPhan, String[] dsHocPhan, String[] diemHocPhan) {
		this.mssv= mssv;
		this.hoTen=hoTen;
		this.ngaySinh= ngaySinh;
		this.soHocPhan= soHocPhan;
		this.dsHocPhan= dsHocPhan;
		this.diemHocPhan= diemHocPhan;
	}
//======================================================================//		
	public String getMssv() {
		return mssv;
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public String getTen() {
		String s = this.hoTen;
		int i;
		for( i=s.length()-1; i>=0; i-- ) {
			if(s.charAt(i)==' ') {
				break;
			}
		}
		return s.substring(i+1);
	}
	
	public Date getNgaySinh() {
		return ngaySinh;
	}
	
	public int getSoHocPhan() {
		return soHocPhan;
	}
	
	public String[] getDsHocPhan() {
		return dsHocPhan;
	}
	
	public String[] getDiemHocPhan() {
		return diemHocPhan;
	}
//======================================================================//
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	public void setSoHocPhan(int soHocPhan) {
		this.soHocPhan = soHocPhan;
	}
	
	public void setDsHocPhan(String[] dsHocPhan) {
		this.dsHocPhan = dsHocPhan;
	}
	
	public void setDiemHocPhan(String[] diemHocPhan) {
		this.diemHocPhan = diemHocPhan;
	}
//======================================================================//	
	@Override
	public int compareTo(SinhVien sv) {
		return this.getTen().compareTo(sv.getTen());
	}
//======================================================================//		
	public void nhapSV() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma so sinh vien: ");
		String mssv = scanner.nextLine();
		
		System.out.print("Nhap ho ten: ");
		String hoTen = scanner.nextLine();
		
		System.out.println("Nhap ngay sinh");
		System.out.print("Ngay: ");
		int ngay = scanner.nextInt();
		
		System.out.print("Thang: ");
		int thang = scanner.nextInt();
		
		System.out.print("Nam: ");
		int nam = scanner.nextInt();
		Date date = new Date(ngay,thang,nam);
		
		System.out.print("Nhap so luong hoc phan da dang ky: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhap danh sach hoc phan");
		String[] dsHocPhan = new String[100];
		for (String string : dsHocPhan) {
			string=null;
		}
		for (int i=0; i<n; i++) {
			System.out.print("Hoc phan thu "+ (i+1)+": ");
			dsHocPhan[i] = scanner.nextLine();
		}
			
		this.mssv=mssv;
		this.hoTen=hoTen;
		this.ngaySinh=date;
		this.soHocPhan=n;
		this.dsHocPhan=dsHocPhan;
	}
//======================================================================//		
	public void nhapDiemHocPhan() {
		Scanner scanner = new Scanner(System.in);
		int n= this.soHocPhan;
		if(n==0) System.out.println("Hoc phan it hon 1");
		else {
			String[] diemHocPhan = new String[100];
			
			for(int i=0; i<n; i++) {
				System.out.print("Diem hoc phan "+this.dsHocPhan[i]+": ");
				diemHocPhan[i] = scanner.nextLine();
			}
			this.diemHocPhan=diemHocPhan;
		}
	}
//======================================================================//	
	@Override
	public String toString() {
		String s= "- "+this.mssv+"\n- "+this.hoTen+"\n- "+this.ngaySinh.toString()+"\n- "+"SLHP "+this.soHocPhan+"\n- "+"DsHocPhan{";
		
		for(int i=0; i<this.soHocPhan; i++) {
			s+=" "+this.dsHocPhan[i]+": "+this.diemHocPhan[i]+" ";
			if(i==this.soHocPhan-1) {
				s+="}\n";
			}
		}
		return s;
	}
//======================================================================//		
	public void dangKyHocPhan() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap hoc phan can them: ");
		String hocPhan = scanner.nextLine();
		System.out.println("Nhap diem");
		String diemHocPhan = scanner.nextLine();
		this.diemHocPhan[this.soHocPhan]= diemHocPhan;
		this.dsHocPhan[this.soHocPhan]=hocPhan;
		this.soHocPhan++;
	}
//======================================================================//		
	public void xoaHocPhan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap hoc phan can xoa: ");
		String hocPhan = scanner.nextLine();
		
		for(int i=0; i<this.soHocPhan; i++) {
				if(this.dsHocPhan[i].compareToIgnoreCase(hocPhan)==0) {
					for(int j=i; j<this.soHocPhan; j++) {
						this.dsHocPhan[j]=this.dsHocPhan[j+1];
						this.diemHocPhan[j]=this.diemHocPhan[j+1];
					}
					this.dsHocPhan[this.soHocPhan-1]=null;
					this.diemHocPhan[this.soHocPhan-1]=null;
					this.soHocPhan--;
					break;
				}
			}
		
	}
//======================================================================//		
	public float diemTB4() {
		int s=0;
		for(int i=0; i<this.soHocPhan; i++) {
			if(this.diemHocPhan[i].compareToIgnoreCase("A")==0) {
				s+=4;
			}
			else if(this.diemHocPhan[i].compareToIgnoreCase("B+")==0) {
				s+=3.5;
			}
			else if(this.diemHocPhan[i].compareToIgnoreCase("B")==0) {
				s+=3;
			}
			else if(this.diemHocPhan[i].compareToIgnoreCase("C+")==0) {
				s+=2.5;
			}
			else if(this.diemHocPhan[i].compareToIgnoreCase("C")==0) {
				s+=2;
			}
			else if(this.diemHocPhan[i].compareToIgnoreCase("D+")==0) {
				s+=1.5;
			}
			else if(this.diemHocPhan[i].compareToIgnoreCase("D")==0) {
				s+=1;
			}
			else if(this.diemHocPhan[i].compareToIgnoreCase("F")==0) {
				s+=0;
			}			
		}
		return (float) s/this.soHocPhan;
	}
//======================================================================//	
	public static void main(String[] args) {
//		SinhVien sv = new SinhVien();
//		sv.nhapSV();
//		sv.nhapDiemHocPhan();
//		System.out.println(sv.toString());
//		sv.dangKyHocPhan();
//		System.out.println(sv.toString());
//		sv.xoaHocPhan();
//		System.out.println(sv.toString());
	}
}
