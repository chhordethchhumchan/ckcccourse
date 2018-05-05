package inheritance;

import javax.swing.JOptionPane;

public class Employee extends Person {
	
	int employeeID;
	int salary;
	String statDate;
	
	public Employee(int employeeID,int salary, String statDate, String name, String dob) {
		super(name, dob);
		this.employeeID = employeeID;
		this.salary = salary;
		this.statDate = statDate;
	}
	public void getInfo() {
		
		super.getInfo();
		System.out.println( "He/She works as employee from" + statDate + "with salary" + salary);
		
	}
	

}
