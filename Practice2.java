public class Pracice2{
	public static void main(String args[]){
		int a = 12;
		System.out.println("Experiment A");
		System.out.println("original value of a is : " + a);
		Argument a2 = new Argument();
		a2.PassByReference(a);
		System.out.println("original value of a is not changed : " + a);
		System.out.println("----------------------------------------------------------");

		System.out.println("Experiment B");
		Student st = new Student();
		st.completedCredits = 24;
		System.out.println("original value of completedCredits = " +  st.completedCredits);
		Mutation m = new Mutation();
		m.Mutationcause(st);
		System.out.println("completed credits out of the function = " + st.completedCredits);
		System.out.println("-----------------------------------------------------------");


		System.out.println("experiment C");
		System.out.println("completed credits before function call : " + st.completedCredits);
		m.Reassignment(st);
		System.out.println("completed credits after function call : "+ st.completedCredits);
		}
}
class Argument{
	void PassByReference(int x){
		x = x + 5;
		System.out.println("passed in the function value is changed : " + x);
	}
}
class Student{
	int completedCredits;}
class Mutation{
	void Mutationcause(Student s){
		s.completedCredits = s.completedCredits + 2;
		System.out.println("completed credits in function = " + s.completedCredits);}

	void Reassignment(Student s){
		s = new Student();
		s.completedCredits = 100;
		System.out.println("completed credits in reassignment in function = " + s.completedCredits);
 }
}