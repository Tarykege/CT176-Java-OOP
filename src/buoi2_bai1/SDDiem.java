package buoi2_bai1;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Diem A: ");
		A.hienThi();
		
		Diem B = new Diem();
		B.nhapDiem();
		System.out.print("Diem B: ");
		B.hienThi();
		
		Diem C = new Diem(-B.getX(),-B.getY());
		System.out.print("Diem C: ");
		C.hienThi();
		
		System.out.println("Khoang cach diem B den tam O: "+ B.khoangCach());
		System.out.println("Khoang cach diem A den diem B: "+ A.khoangCach(B));
		
	}
}
