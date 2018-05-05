package exercise.methodoverloading;

public class BasicRateTax {
	private static final double BASE_TAX_RATE = 0.20;
	private static final double BASIC_INCOME = 1000;
	public double calcTax() {
		return BASE_TAX_RATE*BASIC_INCOME;
	}
	public double calcTax(double grossIncome) {
		
		double Tax;
		
		if(grossIncome>BASIC_INCOME) {
		  Tax = BASE_TAX_RATE*grossIncome;
		}
		else {		
		  Tax =	calcTax(); 
		}
		return Tax;
		
	}

}
