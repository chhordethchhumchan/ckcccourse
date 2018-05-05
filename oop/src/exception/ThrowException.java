package exception;

public class ThrowException {
	void checkAge(int age) {
		if (age<18) {
			throw new ArithmeticException("Not Eligible for voting");
		}
		else {
			System.out.println("Eligible for voting");
		}
			
	}

	// throws keyword
	int division(int a,int b) throws ArithmeticException {
		int t = a/b;
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ThrowException obj = new ThrowException();
		
			obj.checkAge(13);
	
			System.out.println("End of program");
		 */
		ThrowException obj = new ThrowException();
		try {
			System.out.println(obj.division(15, 0));
		}
		catch(ArithmeticException e) {
			System.out.println("You should not divide number by zero");
		}
	}

}
