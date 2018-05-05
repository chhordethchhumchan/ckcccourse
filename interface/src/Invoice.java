
public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	public Invoice(String part,String partDes,int quantity, double price) {
		partNumber = part;
		partDescription = partDes;
		this.quantity = quantity;
		pricePerItem = price;
	}
	public void setPartNumber(String part) {
		this.partNumber = part;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setDescription(String des) {
		this.partDescription = des;
	}
	public String getDescription() {
		return partDescription;
	}
	public void setQuantity(int qty) {
		this.quantity = qty;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setPricePerItem(double price) {
		this.pricePerItem = price;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public String toString() {
		String result = ("PartNumber:"+ getPartNumber()+"Part Description:"+ getDescription()+"Quantity:"+getQuantity()+"Price PerItem"+ getPricePerItem());
		return result;
	}
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}
}
