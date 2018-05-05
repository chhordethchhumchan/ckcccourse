package abstractclass;

public class Hourly extends Employee{
	private int hoursWorked;
	public Hourly(String name,String address, String phone,String secialSecurityNumber,double payRate) {
		super(name,address,phone,secialSecurityNumber,payRate);
	}
	public void addHours(int moreHours) {
		this.hoursWorked = moreHours;
	}
	public double pay() {
		double payment = super.pay() * hoursWorked;
		return payment;
	}
	public String toStirng () {
		String result =(super.toString() + "Hours Wroked:" + hoursWorked);
		return result;
	}
}
