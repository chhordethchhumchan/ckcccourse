package exercise.methodoverloading;

public class TaxCollector {
	public static void main (String [] args) {
		
		BasicRateTax rateTax = new BasicRateTax();
		System.out.println("Base income: "+rateTax.calcTax());
		System.out.print("Gross income: "+rateTax.calcTax(2000));
		
	}
}
