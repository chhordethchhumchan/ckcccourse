package basicjava;

public class Calulator {

	public static void main(String[] args) {

		test(6);
		test(5);
		test(4);
		
	}
	public static void cal() {
		System.out.println("Sum"+sumFunction(5, 5));
		System.out.println("Sub"+subFunction(5, 5));
		System.out.println("Multiply"+multiplyFunciton(5, 5));
		System.out.println("Divide"+DivideFunction(5, 5));
		System.out.println("Min"+MinFunction(3, 5));
		System.out.println("Max"+MaxFunction(5, 5));
	}
	public static double sumFunction(double number1,double number2 ) {
		return number1+number2;
	}
	public static double subFunction(double num1,double num2) {
		return num1-num2;
	}
	public static double multiplyFunciton(double num1,double num2) {
		return num1*num2;
	}
	public static double DivideFunction(double num1,double num2) {
		return num1/num2;
	}
	public static double MinFunction(double num1,double num2) {
//		if(num1==num2) System.out.println("Number1 is equal to Number2: "+num1);
//		if(num1>num2) return num1;
//		else return num2;
		return Math.min(num1, num1);
	}
	public static double MaxFunction(double num1,double num2) {
//		if(num1==num2) {
//			System.out.println("Number1 is equal to Number2: "); 
//			return num2;
//		}
//		else if(num1>num2) return num2;
//		else return num1;
		return Math.max(num1, num1);
		
	}
	public static void test(int x) {
		if (x>5) {
			System.out.println(x+"is>5");
		}
		else if(x<5) System.out.println(x+"is<5");
		else System.out.println(x+"=5");
		
	}
}
