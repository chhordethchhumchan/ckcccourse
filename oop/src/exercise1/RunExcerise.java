package exercise1;

import java.util.Scanner;

public class RunExcerise {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String name,address,program;
		int year;
		double fee;
		System.out.println("Name:");
		name = input.nextLine();
		System.out.println("Address:");
		address = input.nextLine();
		System.out.println("Program:");
		program = input.nextLine();
		System.out.println("Year:");
		year = input.nextInt();
		System.out.println("Fee:");
		fee = input.nextDouble();
		Student student = new Student(name, address, program, year, fee);
		System.out.println(student.toString());
		
	}
}
