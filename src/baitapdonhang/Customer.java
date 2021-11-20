package baitapdonhang;

import java.util.Scanner;

public class Customer {
	private String id;
	private String name;
	private String addr;

	public Customer() {
		id = new String();
		name = new String();
		addr = new String();
	}

	public Customer(Customer k) {
		id = new String(k.id);
		name = new String(k.name);
		addr = new String(k.addr);
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id customer");
		id = sc.nextLine();
		System.out.println("Enter name customer");
		name = sc.nextLine();
		System.out.println("Enter address customer");
		addr = sc.nextLine();
	}

	void output() {
		System.out.print("id: " + id + ", name: " + name + ", address: " + addr);
	}

	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", address: " + addr;
	}

	public static void main(String[] args) {
		Customer c = new Customer();
		c.input();
		c.output();
	}

	public String getId() {
		return id;
	}

	public String getAddr() {
		return addr;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setName(String name) {
		this.name = name;
	}
	public float getTiLeGiam() {
		return 0.0f;
	}
	public void setTiLeGiam(float tiLeGiam) {
		
	}
}
