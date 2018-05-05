
public abstract class Employee implements Payable {

	
	private String firstName;
	private String lastName;
	private String socailSecurityNumber;
	
	public Employee(String firstName,String lastName,String socailSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socailSecurityNumber = socailSecurityNumber;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLasstName(String lastName) {
		this.lastName = lastName;
	}
	public void setSocailSecurityNumber(String socailSecurityNumber) {
		this.socailSecurityNumber = socailSecurityNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSocailSecurityNumber() {
		return socailSecurityNumber;
	}
	public String toString() {
		String result = ("First Name:"+ getFirstName() + "Last Name:" + getLastName() + "SocailSecurity Numbert:" + getSocailSecurityNumber() );
		return result;
	}
}
