package encapstion;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a[]  = new int[2];
		System.out.println("Access element three:" + a[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.print("Expection thrown:" + e);
			
		}
		System.out.print("Out of the block");

	}

}
