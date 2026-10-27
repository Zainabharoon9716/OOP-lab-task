public class FoodDeliveryMain{
	public static void main(String args[]){

		Customer1 c1 = new Customer1("101" , "Zainab" , "House23" );
		DeliveryRider r1 = new DeliveryRider("202" , "Fatima" , "R145M");
		DeliveryRider r2 = new DeliveryRider("203" , "Fajar" , "R146M");	

		FoodOrder f1 = new FoodOrder("7000" , c1 , "567" , 500.00 );	
		FoodOrder f2 = new FoodOrder("8000" ,c1 , "568" , 400.00 );

		DeliveryDesk D = new DeliveryDesk(" Desk 1 ");

		System.out.println("Desk name = " + D.getdeskName());

		D.addOrder(f1);
		D.addOrder(f2);
		D.addRider(r1);
		D.addRider(r2);

		D.displayDesk();
}
}
		
