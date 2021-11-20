package baitapdonhang;

import java.util.Scanner;

public class Bill {
	private String id;
	private String title;
	private String nameEmployee;
	private Date date;
	private Customer customer;
	private Detail detail[];
	private int numberTypeOfCommodity;
	private final static int MAX = 20;

	public Bill() {
		id = new String();
		title = new String();
		nameEmployee = new String();
		date = new Date();
		customer = new Customer();
		detail = new Detail[MAX];
		numberTypeOfCommodity = 0;
	}

	public Bill(Bill b) {
		id = new String(b.id);
		title = new String(b.title);
		nameEmployee = new String(b.nameEmployee);
		date = new Date(b.date);
		customer = new Customer(b.customer);
		detail = new Detail[b.MAX];
		numberTypeOfCommodity = b.numberTypeOfCommodity;

		for (int i = 0; i < b.numberTypeOfCommodity; i++) {
			detail[i] = new Detail(b.detail[i]);
		}
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bill's id:");
		id = sc.nextLine();

		System.out.println("Enter bill's title");
		title = sc.nextLine();

		System.out.println("Enter bill's employee");
		nameEmployee = sc.nextLine();

		System.out.println("Enter bill's date");
		date.input();

		System.out.println("Enter bill's customer...");
		System.out.println("press 0: customer, press 1: VIP");
		int select;
		select = sc.nextInt();
		if (select == 1)
			customer = new CustomerVIP();
		else
			customer = new Customer();
		sc.nextLine();
		customer.input();

		System.out.println("Enter bill's quantity type of commodity");
		numberTypeOfCommodity = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter bill's infor each commodity...");
		for (int i = 0; i < numberTypeOfCommodity; i++) {
			detail[i] = new Detail();
			System.out.print("Enter commodity of " + (i + 1) + "...\n");
			detail[i].input();
		}
	}

	public void output() {
		System.out.print("-- " + title + " --\n");
		System.out.print("Id: " + id + "\n");
		System.out.print("Employee: " + nameEmployee + "\n");
		System.out.print("Date: " + date + "\n");
		System.out.print("Customer: " + customer + "\n");
		System.out.print("Total: " + totalPrice() + "\n");
		System.out.print("List commodity\n");
		for (int i = 0; i < numberTypeOfCommodity; i++) {
			System.out.print("STT " + (i + 1) + " " + detail[i] + "\n");
		}
		System.out.println("----------");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "-- " + title + " --\nId: " + id + "\nEmployee: " + nameEmployee + "\nDate: " + date + "\nCustomer: "
				+ customer + "\nTotal: " + totalPrice() + "\nList commodity\n";
		for (int i = 0; i < numberTypeOfCommodity; i++) {
			s += ("STT " + (i + 1) + " " + detail[i] + "\n");
		}
		s += "----------";
		return s;
	}

	public float totalPrice() {
		float f = 0.0f;
		for (int i = 0; i < numberTypeOfCommodity; i++) {
			f += detail[i].getPrice() * detail[i].getQty();
		}
		f = f - f * customer.getTiLeGiam();
		return f;
	}

	public void sortbyTotal() {
		for (int i = 0; i < this.numberTypeOfCommodity; i++) {
			for (int j = i + 1; j < this.numberTypeOfCommodity; j++) {
				float tempi = detail[i].getPrice() * detail[i].getQty();
				float tempj = detail[j].getPrice() * detail[j].getQty();
				if (tempi > tempj) {
					Detail t = new Detail(this.detail[i]);
					this.detail[i] = new Detail(this.detail[j]);
					this.detail[j] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		Bill b = new Bill();
		b.input();
		b.output();
	}
}
