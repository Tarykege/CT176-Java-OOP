package buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Toa do diem A: ");
		A.inDiem();
		System.out.println();
		
		Diem B = new Diem();
		System.out.println("Nhap toa do diem B");
		B.nhapDiem();
		System.out.print("Toa do diem B: ");
		B.inDiem();
		System.out.println();
		
		Diem C = new Diem(-B.layX(),-B.layY());
		System.out.print("Toa do diem C: ");
		C.inDiem();
		System.out.println();
		
		System.out.format("Khoang cach diem B den tam O: %.2f\n", B.khoangCach());
		System.out.format("Khoang cach diem A den diem B: %.2f\n",A.khoangCach(B));
		
	}
}
