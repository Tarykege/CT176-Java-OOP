package baitapdonhang;

import java.util.Scanner;

public class Detail {
	private Commodity commodity;
	private int qty;
	private float price;

	public Detail() {
		commodity = new Commodity();
		qty = 0;
		price = 0.0f;
	}

	public Detail(Detail d) {
		commodity = new Commodity(d.commodity);
		qty = d.qty;
		price = d.price;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter commodity...\n");
		commodity.input();
		System.out.print("Enter qty: ");
		qty = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter price: ");
		price = sc.nextFloat();
		sc.nextLine();
	}
	public void output() {
		System.out.println(commodity + ", Qty: "+qty+", price: "+price);
	}
	@Override
	public String toString() {
		return (commodity + ", Qty: "+qty+", price: "+price);
	}
	public Commodity getCommodity() {
		return commodity;
	}
	public int getQty() {
		return qty;
	}
	public float getPrice() {
		return price;
	}
	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public static void main(String[] args) {
		Detail d = new Detail();
		d.input();
		d.output();
		System.out.print("\n--------");
		System.out.println(d);
	}
}
