package baitapdonhang;

import java.util.Scanner;

public class CustomerVIP extends Customer {
	private float tiLeGiam;
	private Date date;

	public CustomerVIP() {
		super();
		tiLeGiam = 0.0f;
		date = new Date();
	}

	public CustomerVIP(CustomerVIP V) {
		super(V);
		tiLeGiam = V.tiLeGiam;
		date = V.date;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Enter ti le giam: ");
		tiLeGiam = sc.nextFloat();
		System.out.println("Enter date become VIP");
		date.input();
	}

	public void output() {
		System.out.print(super.toString() + ", ti le giam: " +", date: "+ tiLeGiam + date);
	}

	@Override
	public String toString() {
		return super.toString() + ", Ti le giam: " + tiLeGiam +", date: "+ date;
	}
	public float getTiLeGiam() {
		return tiLeGiam;
	}
	public Date getDate() {
		return date;
	}
	public void setTiLeGiam(float tiLeGiam) {
		this.tiLeGiam = tiLeGiam;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public static void main(String[] args) {
		Customer C = new CustomerVIP();
		C.input();
		System.out.println(C);
	}
}
