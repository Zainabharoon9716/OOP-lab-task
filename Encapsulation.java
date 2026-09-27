public class Encapsulation{
	public static void main(String args[]){
	Encapsulation2 e2= new Encapsulation2();
	// e2.setAmount(-1000);  Negative number ayega output
	e2.setAmount(1000);  // 1000.0 ayega answer
	System.out.println(e2.getAmount());
        // e2.balance = -1000.0; it will give the error that balance is private

	}
}
class Encapsulation2{
	private double balance;
	
	public void setAmount(double amount){
		if(amount<0)
		System.out.println("Negative number");
		else
		balance = amount;
		}

	public double getAmount(){
		return balance; }
}

// ---------------------------------------------------------------------
// WITHOUT ENCAPSULATION
/* public class Encapsulation{
	public static void main(String args[]){
	Encapsulation2 e2= new Encapsulation2();
	// e2.setAmount(-1000);  Negative number ayega output
	e2.setAmount(1000);  // 1000.0 ayega answer
	System.out.println(e2.getAmount());

        lekin ab agr ma yahan 
	e2.balance = -1000.0  karoin tou it will set the amount -1000.0 
	}
}
class Encapsulation2{
	public double balance;  isy public krdia
	
	public void setAmount(double amount){
		if(amount<0)
		System.out.println("Negative number");
		else
		balance = amount;
		}

	public double getAmount(){
		return balance; }
}         */
