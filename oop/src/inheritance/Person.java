package inheritance;

public class Person {
	String name;
	String dob;
	protected Person(String name,String dob) {
		this.name = name;
		this.dob = dob;
	}
	public void getInfo() {
		
		System.out.println("Hello my name is:" + name + "I was born in: " + dob);
		
	}
	
}
