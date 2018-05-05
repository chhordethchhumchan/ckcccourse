package method;

import java.util.Scanner;

public class Student {
	
	String name;
	int age;
	String address;

	Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	Student() {
		name = "Unknown";
		age = 0;
		address = "not available";
	}

	void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	String printStudent() {
		return "Name:" + name + "\tAge:" + age + "\tAddress:" + address;
	}
	void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Name :");
		name = in.next();
		System.out.print("Age :");
		age = in.nextInt();
		System.out.print("Address :");
		address = in.next();
	}

	

}
