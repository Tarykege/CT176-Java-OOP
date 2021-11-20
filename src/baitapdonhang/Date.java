package baitapdonhang;

import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}

	public Date(Date d) {
		day = d.day;
		month = d.month;
		year = d.year;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter day");
			day = sc.nextInt();
			System.out.println("Enter month");
			month = sc.nextInt();
			System.out.println("Enter year");
			year = sc.nextInt();
			if (!checkDate())
				System.out.println("Enter again");
		} while (!checkDate());
		sc.nextLine();
	}

	public void output() {
		System.out.print(day + "/" + month + "/" + year);
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}

	public boolean checkDate() {
		int[] max = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0))
			max[2] = 29;
		if (day > 0 && month > 0 && year > 0 && month < 13 && day <= max[month])
			return true;
		return false;
	}
	public static void main(String[] args) {
		Date d = new Date();
		d.input();
		d.output();
	}
}
