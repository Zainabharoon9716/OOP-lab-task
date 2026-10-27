public class DeliveryDesk{
	private String deskName;
	private FoodOrder[] orders = new FoodOrder[3];
	private DeliveryRider[] riders = new DeliveryRider[2];

	private int countorder = 0;
	private int countrider = 0;

	public DeliveryDesk( String deskName){
	this.deskName = deskName;
}

	public String getdeskName(){
		return deskName;}

	public void addOrder(FoodOrder order){
	
	if (countorder < orders.length){
	orders[countorder] = order;
	countorder++;}
	else
	System.out.println("Capacity full for order");
}

	public void addRider(DeliveryRider rider){
	if (countrider < riders.length){
	riders[countrider] = rider;
	countrider++;	}
	else
	System.out.println("Capacity full for riders");


}

	public void displayDesk(){
	for(int i = 0 ; i < countorder ; i++){
		System.out.println("Detail of order ");		orders[i].displayOrder();

	}

	for(int i = 0 ; i < countrider ; i++){
		System.out.println("Detail of rider " );
		riders[i].displayInfo();
	}

}
}