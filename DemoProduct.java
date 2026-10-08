public class DemoProduct{
	public static void main(String args[]){
	Product P1 = new Product("facewash",20.001,3);
	Product P2 = new Product("soap",30.00,2);
	Product P3 = new Product("toffee",22.09,4);
	P1.displayProduct();
	P2.displayProduct();
	P3.displayProduct();
	Product.displayMaxprice();
	Product.displayMinprice();
}
}

	