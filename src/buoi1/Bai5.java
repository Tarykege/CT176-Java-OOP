package buoi1;

public class Bai5 {
	public static void ptb1(int a, int b){
		System.out.println("x= "+(float)-b/a);
	}
	public static void ptb2(int a, int b, int c) {
		if(a==0) {
			ptb1(b,c);
		}
		else {
			double delta = b*b-4*a*c;
			if (delta>0) {
				double x1= (-b+Math.sqrt(delta))/(2*a);
				double x2= (-b-Math.sqrt(delta))/(2*a);
				System.out.println("x1= "+x1);
				System.out.println("x2= "+x2);
			} else if (delta ==0) {
				double x=(double) -b/(2*a);
				System.out.println("x= "+x);
			}else if(delta<0) {
				System.out.println("Vo nghiem");
			}			
		}
	}
	public static void main(String[] args) {
		System.out.println("Done");
	}
}
