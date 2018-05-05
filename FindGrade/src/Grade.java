
public class Grade {

	
	
	
	public static void printPay(double hour,double wage) {
		double money;
		
		if(hour > 60 || wage < 8) {
			System.out.print("Your Maximum Work is :60 hours a week and Mininum Wage:8$/hour\n");
		}
		else {
			if(hour <= 40) {
				 money = hour * wage;
			}
			else {
				money = (40 * wage) + (hour - 40) * wage * 1.5;
			}
			 
			System.out.print("Work hour"+ hour+"payment"+ money);
		}
		
	}
	
	public void array() {
		int [] values = new int [5];
		for(int i = 0; i<values.length; i++) {
			values[i] = i;
			int y = values[i]*values[i];
			System.out.print(y);
		}
	}
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i<100; i++) {
			if(i==50) {
				continue;
				
			}
			System.out.println(i);
		}
		// TODO Auto-generated method stub
//		printPay(70,9);
//		printPay(60,8);

	}
	public static double findgrade(double grade) {
		if(grade<50 ) {
			System.out.print("Grade F");
		}
		else if(grade <=60) {
			System.out.print("Grade D");
		}
		else if(grade <=80) {
			System.out.print("Grade C");
		}
		else if(grade <=90) {
			System.out.print("Grade B");
		}
		else{
			System.out.println("Grade A");
		}
		return grade;
	}
	

}
