package encapstion;

public class RunEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapTest encap = new EncapTest();
		encap.setName("Data");
		encap.setIdNum("002");
		encap.setAge(20);
		
		System.out.print("Name:" + encap.getName() + "Age:" + encap.getAge() );

	}

}
