package inheritance;

public class RunCode {

	public static void main (String [] args) {
		
		Employee anEmployee = new Employee(101,300,"03/11/1907","Dara","01/2/2018");
//		anEmployee.name = "Access Name";
//		anEmployee.dob = "03/11/1907";
//		anEmployee.employeeID = 1001;
//		anEmployee.salary = 300;
//		anEmployee.statDate = "01/2/2018";
		anEmployee.getInfo();
		
	}
}
