
public class SalariedEmployee extends Employee{

	private double weeklySalary;
	public SalariedEmployee(String firstName,String lastName,String socailSecurityNumber,double salary) {
		
		super(firstName,lastName,socailSecurityNumber);
		this.weeklySalary = weeklySalary;
		
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public double getPaymentAmount() {
		return 0;
	}
}
