package exercise.inheritance;

public class TaxCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HigherRateTax higherRateTax = new HigherRateTax();
		System.out.println("Higher Rate Tax:"+higherRateTax.calcTax(34000));
		System.out.println("Higher Rate Tax:"+higherRateTax.calcTax(15000));
		System.out.println("Higher Rate Tax:"+higherRateTax.calcTax(90000));

	}

}
