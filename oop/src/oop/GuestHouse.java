package oop;

import java.util.Scanner;

public class GuestHouse {
	String roomNumber;
	String roomType;
	
	// True: room is busy
	// False: room is false
	boolean status;
	double price;
	
	GuestHouse(){
		roomNumber = "Room001";
	    roomType = "Double";
		status = true;
		price = 400.0;
	}
	
	GuestHouse(String roomNumber,String roomType,boolean status,double price){
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.status = status;
		this.price = price;
	}

	void checkGustCheckRoom() {
		if(status == true) {
			System.out.print("This room is Busy!!!");
		}
		else{
			System.out.print("This room is Free!!!");
		}
	}
	
	int getNumberOfRoomType() {
		
		int bed;
		
		if(roomType.equalsIgnoreCase("Single")) {
			bed = 1;
		}
		else if(roomType.equalsIgnoreCase("Single")) {
			bed = 2;
		}
		else {
			bed = 3;
		}
		return bed;
		
	}
	
	double getPriceOfRoom (){
		return price;
		
	}
	
	void changeRoomType(String roomType) {
		System.out.print(this.roomType = roomType);
	}
	
	public static void main(String [] args) {
		
//		GuestHouse [] room = new GuestHouse[] {
//				new  GuestHouse("R001","Single",true,45.0),
//				new  GuestHouse("R002","Double",false,90.0),
//		};
//		
//		for(int i = 0; i<room.length; i++) {
//			room[i].getNumberOfRoomType();
//			room[i].checkGustCheckRoom();
//			room[i].getPriceOfRoom();
//			System.out.println(room[1].getPriceOfRoom());
//			System.out.println(room[1].getNumberOfRoomType());
//			
//		}
//	
//		
//		room [1].changeRoomType("R005");
//		
		Scanner input=new Scanner(System.in);  
		System.out.print("RoomNumber:");
		String roomNumber = input.next();
		System.out.print("RoomType:");
		String roomType = input.next();
		System.out.print("Status:");
		boolean  status = input.nextBoolean();
		System.out.print("Price:");
		double price = input.nextDouble();
		GuestHouse room = new GuestHouse(roomNumber,roomType,status,price);
		System.out.print(room.getNumberOfRoomType());
		
		input.close();
		
		
	}

}
