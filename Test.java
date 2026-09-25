public class Test{
	public static void main (String args[]){
		System.out.println("Application to find maximum number");
		
		FindMax ob1 = new FindMax();
		System.out.println("Max num is : " + ob1.max(3,5));
		System.out.println("Max num is : " + ob1.max(45.55,59.9098));
		System.out.println("Max num is : " + ob1.max("AHMAD","SHAHID"));
	}
}
