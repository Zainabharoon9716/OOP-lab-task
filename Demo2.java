public class Demo2{
	public static void main(String args[]){
		Circle c1= new Circle();
		System.out.println(c1);
		c1.radius1=10;
		c1.radius2=10;
		double radius = c1.calradius();
		System.out.println(radius);
	}
}
	class Circle{
		double radius1;
		double radius2;
		double calradius(){
		return radius1*radius2;}
}
