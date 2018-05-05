package basicjava;

public class FunctionWithParameter {
	public static void times(double a, double b) {
		System.out.println(a*b);
		
		
	}
	public static int Sum(int a,int b) {
		return a*b;
		
	}
	public static void main(String[] args) {
		times(2, 2);
		times(3,4);
		System.out.println(Sum(3, 7));
		
	}

	
}
