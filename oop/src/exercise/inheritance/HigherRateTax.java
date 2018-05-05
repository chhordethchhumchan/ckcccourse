package exercise.inheritance;

import exercise.methodoverloading.BasicRateTax;

public class HigherRateTax extends BasicRateTax{
	public double calcTax(double grossIncome) {
		double takeTax;
		if(grossIncome<=34000) {
			takeTax = super.calcTax(grossIncome);
		}else if(grossIncome<15000) {
			takeTax =0.4*grossIncome;
		}
		else {
			takeTax =0.5*grossIncome;
		}
		return takeTax;
	}
	

}
