package abstractclass;

public class Staff {

	 private StaffMember[] staffList;
	 public Staff() {
		staffList = new StaffMember[5];
		staffList[0] = new Executive("Dara", "PP", "0124363", "001", 2.0);
		staffList[1] = new Employee("Tyda", "TK", "023545", "002", 5.0);
		staffList[2] = new Employee("Sok", "PP", "024324", "003", 7.0);
		staffList[3] = new Hourly("Nita", "PP", "024329", "004", 10);
		staffList[4] = new Volunteer("Theara", "Tk", "056768");
		((Executive)staffList[0]).awardBonus(500.0);
		((Hourly)staffList[3]).addHours(50);
	 }
	 
	 public void payday() {
		 double amount;
		 for(int count = 0; count< staffList.length; count ++) {
			      System.out.println(staffList[count]);
			      amount = staffList[count].pay();
			 if(amount == 0) {
				 System.out.println("Thank");
			 }
			 else {
				 System.out.println("paid:" + amount);
				 System.out.println("..................");
			 }
			 
		 }
		 
	 }
	 public static void main(String [] args) {
		 Staff staff = new Staff();
		 staff.payday();
	 }
	
}
