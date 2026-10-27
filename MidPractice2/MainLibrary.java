public class MainLibrary{
	public static void main(String args[]){
		
		Book b1 = new Book("45I" ,"THE KITE RUNNER" , "10001","3" , "khalid hesseni");
		Book b2 = new Book("46I" ,"THE SILENT PATIENT" , "10002","4", "OMER");
		Magazine m1 = new Magazine("47I" ,"SUNDAY TIMES" , "10003","5" , 198);

		LibrarySection S1 = new LibrarySection("Section 1 ");

		S1.additem(b1);
		S1.additem(b2);
		S1.additem(m1);

		
		Book b3 = new Book("47I" ,"CROCODILES" , "10004","6" , "TARIQ");
		S1.additem(b3);
		S1.displayItems();

		Magazine m2 = new Magazine("48I" ,"TIME FLIES" , "10005","7" , 199);
		S1.additem(m2);

		}
}