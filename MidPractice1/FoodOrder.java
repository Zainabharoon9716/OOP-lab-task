public class FoodOrder{

	private String orderId;
	private Customer1 customer;
	private Bill bill;

	public FoodOrder(String orderId ,Customer1 customer, String billNumber, double totalAmount){
	
	this.orderId = orderId;
	this.customer = customer;	
	this.bill = new Bill(billNumber , totalAmount);
}

	
	public void displayOrder(){
	System.out.println(" orderId  = " + orderId);
	System.out.println(" CustomerDetails "); 
	customer.displayInfo();
	System.out.println(" billDetails ");
	bill.displayBill();
	

}
}