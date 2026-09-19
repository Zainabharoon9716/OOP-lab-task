public class C1c2{

	public static void main(String args[]){
		CircleB c1= new CircleB();
		CircleB c2=new CircleB();
		System.out.println(c1);
		System.out.println(c2);

		c1=c2;
		
		c1.radius=-30;
		System.out.println(c1+" "+c1.radius);
		System.out.println(c2+" "+c2.radius);

		CircleB c3=null;
		System.out.println(c3);

	}

}
 class CircleB{
	double radius;}