package method;

public class CaltulateArea {

	private double width;
	double height;

	CaltulateArea() {
		this.width = 3.0;
		this.height = 5.0;
	}

	public double getArea(double width, double height) {
		return getWidth() * getHeight();
	}

	public double getArea() {
		return getWidth()*getWidth();
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public static void main(String[] args) {
		CaltulateArea area = new CaltulateArea();
		double square = area.getArea();
		double rectangle = area.getArea(5, 8);
		System.out.println("Area square:" + square);
		System.out.print("Area square:" + rectangle);

	}
}
