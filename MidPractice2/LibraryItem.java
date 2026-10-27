public class LibraryItem{
	private String itemId;
	private String title;
	private BarcodeLabel label;

	public LibraryItem(String itemId , String title , String barcodeNumber , String shelfCode){
	this.itemId = itemId;
	this.title = title;
	this.label = new BarcodeLabel(barcodeNumber , shelfCode);}

	public void displayInfo(){
	System.out.println("itemId = "+ itemId);
	System.out.println("  title = "+  title);
	System.out.println(" barcodeNumber = " + label.getbarcodeNumber() ) ;
	System.out.println("shelfcode = "+ label.getshelfCode() );


}
}

	