public class OnlineClass{
	public static void main(String args[]){
		Student s = new Student();
		s.studentId = "CIIT/SP26-BAI-003/LHR";
		s.name = "Abdul Rehman Azam";
		s.completedCredits = 12;

		s.addCredits(3);
		s.addCredits(3,1);
		System.out.println(s.remainingCredits(130));}
}
class Student {
	String studentId;
	String name;
	int completedCredits;
	
	void addCredits(int c) { completedCredits += c;}
	void addCredits(int c, int bonus ) { completedCredits += c; }
	int remainingCredits(int total) {
	return total - completedCredits;
	}
}