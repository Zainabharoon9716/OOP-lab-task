public class LabTask2{
	public static void main(String args[]){
	Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.studentId = "SP26-BAI-052";
		s1.name      = "Zainab Haroon";
		s1.completedCredits = 12;

		s2.studentId = "SP26-BAI-002";
		s2.name      = "Amna Basit";
		s2.completedCredits = 13;
	
		s3.studentId = "SP26-BAI-005";
		s3.name      = "Fatima Ansar";
		s3.completedCredits = 14;
		
		System.out.println( "Before any change : \n");
		System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
		System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);		
		System.out.println( s3.studentId + " " + s3.name + " " + s3.completedCredits);

                //Predicted result = 18

		s1.addCredits(6);
		System.out.println("After change in credits of Zainab Haroon : " + s1.completedCredits + "\n");
		
		//Predicted result = 21

		s2.addCredits(8);
		System.out.println("After change in credits of Amna Basit : " + s2.completedCredits + "\n");

		int remaining = s3.remainingCredits(45);
		System.out.println("Remaining credits of Fatima ansar : " + remaining + "\n");
		int remaining1 = s2.remainingCredits(45);
		System.out.println("Remaining credits of Amna Basit : " + remaining1 + "\n");

		String summary1 = s1.summary();
		System.out.println(summary1);
		String summary2 = s2.summary();
		System.out.println(summary2);
		String summary3 = s3.summary();
		System.out.println(summary3);
		
	}
}
class Student {
	String studentId;
	String name;
	int completedCredits;

	void addCredits(int credits){
		completedCredits = completedCredits + credits;
	}
	
	int remainingCredits(int degreeCredits){
		int remaining = degreeCredits - completedCredits;
		return remaining;}

	String summary(){
		String information = "ID = " + studentId + " Name = " + name + " completedCredits = " + completedCredits;	
		return information;}
	}
		

