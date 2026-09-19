public class LabTask1{
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

		System.out.println( "Before change : \n");
		System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
		System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);		
		System.out.println( s3.studentId + " " + s3.name + " " + s3.completedCredits);

		s1.completedCredits = s1.completedCredits + 5;
		
		System.out.println( "After change : \n");
		System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);   
		System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);		
		System.out.println( s3.studentId + " " + s3.name + " " + s3.completedCredits);

		// s1, s2 ,s3 are seperate student objects
		// that is why change in s1 does not affect s2 and s3;
	}
}
class Student {
	String studentId;
	String name;
	int completedCredits;
	}

		