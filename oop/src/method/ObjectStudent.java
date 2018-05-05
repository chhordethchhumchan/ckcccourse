package method;

import java.util.Scanner;

public class ObjectStudent {

	public static void main(String[] args) {
		Student[] students = new Student[] {
				new Student(),
				new Student("Mr.B",17,"PP"),
				new Student("Mr.C",18,"PP"),
				new Student("Mr.D",25,"PP"),
				new Student("Mr.E",30,"PP")
				};
		students[2].setInfo("Nita", 23);
		
		for(int i = 0;i<students.length;i++) {
			
			System.out.println(students[i].printStudent());
			
		}
		
		int n;
		System.out.print("Input Number to print students:");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		Student[] studentInput = new Student[n];
		for(int i = 0; i<n; i++) {
			
			studentInput[i] = new Student();
			studentInput[i].input();
	
		}
		for(int i = 0;i<n;i++) {
					
			System.out.println(studentInput[i].printStudent());
					
		}

	}

}
