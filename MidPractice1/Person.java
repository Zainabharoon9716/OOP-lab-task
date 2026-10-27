public class Person{
	private String personId;
	private String name;

	public Person(String personId , String name){
	this.personId = personId;
	this.name = name;
}

	public void displayInfo(){
	
	System.out.println("PERSONID = " + personId);
	System.out.println("NAME = " + name);

}
}