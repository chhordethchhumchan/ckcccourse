package oop;

public class SmartPhone {
	private String model;
	private double price;
	private double width;
	private double height;
	SmartPhone(String model,double price,double width,double height){
		this.model = model;
		this.price = price;
		this.width = width;
		this.height = height;
	}
	double getPrice() {
		return price;
	}
	String getDodule() {
		return model;
	}
	double calulateScreenSize() {
		return Math.sqrt(width*width+height*height);
	}
	public static void main(String [] args) {
		SmartPhone smartPhone = new SmartPhone("Sony", 200, 100, 50);
		System.out.print(smartPhone.model);
		
	}
}
