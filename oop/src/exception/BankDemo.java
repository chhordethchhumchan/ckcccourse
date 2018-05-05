package exception;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Depositing $500...");
		c.deposit(500.0);
		try {
			System.out.println("\nWith drawing$100 ...");
			c.withdraw(100.0);
			System.out.println("\nWith drawing$600 ...");
			c.withdraw(600.0);
		}catch(InsufficientFundException e) {
			System.out.print("Sorry, but you are short $" + e.getAmount());
			e.printStackTrace();
		}

	}

}
