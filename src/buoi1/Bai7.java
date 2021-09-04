package buoi1;

import java.util.Scanner;
public class Bai7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		String s= scanner.nextLine();
		scanner.close();
		System.out.println("Ten: "+ printName(s));
		}
		
		public static String printName(String s) {
			int posName=0;
			s=s.trim();
			for (int i=s.length()-1; i>=0; i-- ) {
					if(s.charAt(i)== ' ') {
						posName=i+1;
						break;
					}
				}
			return s.substring(posName);
		}
	}	
