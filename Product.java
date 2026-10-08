public class Product{
	private String Id;
	private String name;
	private double price;
	private int quantity;
	private static double Maxprice = 0;
	private static double Minprice = Double.MAX_VALUE;
	private static int counter = 1;
	
	public Product(String name , double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		if ( price > Maxprice ) 
			Maxprice = price;
		if (price < Minprice) 
			Minprice = price;

}

	{ this.Id = " " + String.format("P%01d", counter ++);}

	public void displayProduct(){
		System.out.println(name + " " + Id + " " + price + " " + quantity);
}
	public static double GetMaxprice(){
					return Maxprice;}
	public static double GetMinprice(){
					return Minprice;}
	public static void displayMaxprice(){
		System.out.println("Maxprice" + Maxprice);}
	public static void displayMinprice(){
		System.out.println("Minprice" + Minprice);}


}

		