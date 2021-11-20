package baitapdonhang;

public class UseBill {
	public static void main(String[] args) {
		Bill bill = new Bill();
		bill.input();
		bill.output();
		System.out.println("-------------");
		Bill bill2 = new Bill(bill);
		bill2.sortbyTotal();
		bill2.output();
	}
}
