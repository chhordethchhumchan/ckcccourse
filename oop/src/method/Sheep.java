package method;

public class Sheep {

		int penNumber;
		static int totalSheep = 0;
		public Sheep(int n) {
			penNumber = n;
			totalSheep ++;
			
		}
		public int find() {
			return penNumber;
		}
		public void moveTo(int differentPen) {
			penNumber = differentPen;
		}
		public static int coutAll() {
			return totalSheep;
		}
		public static void main(String [] args) {
			Sheep s1 = new Sheep(1);
			Sheep s2 = new Sheep(3);
			Sheep s3 = new Sheep(5);
			System.out.println("Total number of sheep is" +Sheep.coutAll());
			System.out.println("Draye is in pen"+s1.find());
			s2.moveTo(7);
			System.out.println("move s1");
			System.out.println("s1 is move in pen" +s2.find());
		}
}
