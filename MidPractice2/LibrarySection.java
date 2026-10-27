public class LibrarySection{
	private String sectionName;
	private LibraryItem[] items = new LibraryItem[4];
	private int count = 0;

	public LibrarySection(String sectionName){
	this.sectionName = sectionName;
	System.out.println("Section name = " + sectionName);}

	public void additem(LibraryItem item){
		if (count < items.length){
		items[count] = item; 
		count++; }
		else 
		System.out.println("Section full for items ");
}

	public void displayItems(){
	for(int i =0; i < count ; i++){
	System.out.println("INFORMATION");
	items[i].displayInfo();
}
}
}