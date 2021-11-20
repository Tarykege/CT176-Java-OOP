package baitapdonhang;

import java.util.Scanner;

public class Commodity {
	private String id;
	private String name;
	private String producer;
	
	public Commodity() {
		id = new String();
		name = new String();
		producer = new String();
	}
	public Commodity(Commodity c) {
		id = new String(c.id);
		name = new String(c.name);
		producer = new String(c.producer);
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id commodity: ");
		id = sc.nextLine();
		System.out.print("Enter name commodity: ");
		name = sc.nextLine();
		System.out.print("Enter producer commodity: ");
		producer = sc.nextLine();
	}
	public void output() {
		System.out.print("id: "+id+", name: "+name+", producer: "+producer);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("id: "+id+", name: "+name+", producer: "+producer);
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getProducer() {
		return producer;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public static void main(String[] args) {
		Commodity C = new Commodity();
		C.input();
		C.output();
		System.out.println("\n-----");
		System.out.println(C);
	}
}
