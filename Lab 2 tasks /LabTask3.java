public class LabTask3{
	public static void main(String args[]){
	
	OverLoad o1= new OverLoad();
	o1.enroll("101AB");
	o1.enroll("1012ABC" , 4);	
	o1.enroll(404);
	
	/* invalid outcomes :
	o1.enroll( 4 , "1012ABC")

	o1.enroll() has no arguments 
	
	int enroll(String courseCode){
		return 0;}         return type is not part of the method signature
	
	*/
	}
}

class OverLoad {
		
	//signature : enroll(String)
	void enroll(String courseCode){
	System.out.println("Enrolled in course : " + courseCode); 
	
}

	//signature : enroll(String , int)
	void enroll(String courseCode,int section){
	System.out.println("Enrolled in course : " + courseCode + " along the section : " + section); 
}

	//signature : enroll(int)
	void enroll(int numericCourseCode){
	System.out.println("Enrolled in the numericcourse code : " + numericCourseCode); 
}

		}
		

