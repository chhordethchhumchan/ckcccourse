package exercise1;

public class Staff extends Person {
	
	private String school;
	private double pay;
	public Staff(String name,String address,String school,double pay) {
		super(name, address);
		this.school = school;
		this.pay =pay;
	}
	
	// getter
	
	public String getSchool() {
		return school;
	}
	public double getPay() {
		return pay;
	}
	
	// setter
	
	public void setSchool(String school) {
		this.school = school;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	// toString method
	
	public String toString() {
		return ("Staff"+ super.toString()+ ",School =" + getSchool() + ",Pay=" + getPay() + "]");
	}
}
