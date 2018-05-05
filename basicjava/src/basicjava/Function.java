package basicjava;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callMain();
		System.out.println("Line 1");
		treeLines();
		System.out.println("Line 2");
		treeLines();
		// Sqare
		int value =2;
		printSquare(value);
		printSquare(3);
		printSquare(value*2);

	}
	public static void helloWorld() {
		System.out.println("Hello world");
	}
	public static void callHellworld() {
		
		for(int i=0 ;i<3;i++) {
			helloWorld();
		}
		
	}
	public static void callMain() {
		callHellworld();
		System.out.println("Welcome Java");
		
	}
	public static void newLine() {
		System.out.println("");
		
	}
	public static void treeLines() {
		newLine();newLine();newLine();
	}
	
	// Square
	public static void printSquare(int x) {
		System.out.println(x*x);
	}
	
}
