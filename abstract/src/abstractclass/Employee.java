package abstractclass;

public class Employee extends StaffMember {

	protected String socialSecurityNumber;
	protected double payRate;
	public Employee(String name,String address,String phone,String socialSecurityNumber,double payRate) {
		super(name,address,phone);
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}
	public String toString() {
		String result = (super.toString()+",SocialSecurityNumber:" + socialSecurityNumber + ",PayRate:"+ payRate);
		return result;
	}
	public double pay() {
		return payRate;
	}
}
