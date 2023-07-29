package BasicJava;

// An abstract class is a class that is designed to be specifically used as a base class. 
// Abstract classes cannot be instantiated, but they can be subclassed.
// a concrete method or class has a proper definition here it has no definition so it is an abstract class
// if a class has any one abstract method the class should be abstract.
// The abstract class can contain both abstract and concrete method.

abstract class Member{ 
	String name;
	abstract void welcomeMessage(); // abstract method
	String getName() {//concrete method  
		return name;
	}
}

// the inherited abstract has must mandatorily define the abstract method else shows error. 
// if not then we must define the inherited class as abstract and if that class is inherited it must define the abstract method within the class.

class Teacher extends Member{ 
	void welcomeMessage() {
		System.out.println("Welcome Teacher");
	}
}

class Students extends Member{
	void welcomeMessage() {
		System.out.println("Welcome Student");
	}
}

// Area of triangle and rectangle 

abstract class Shape{
	double l,b;
	abstract double area(double l,double b);
	abstract void displayShape();
	
	Shape(){ //initializing using constructor
		l=2;
		b=3;
	}
}

class Triangle extends Shape{
	double area(double l,double b) {
		return (l*b)/2;}
	void displayShape() {
		System.out.println("Area of Triangle: "+ area(3,3)); // initializing explicitly
	}
}

class Rectangle extends Shape{
	double area(double l,double b) {
		return l*b;}
	void displayShape() {
		System.out.println("Area of Rectangle: "+l+"*"+b+" is: "+area(l,b));
	}
}
public class Abstract { 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Member m1=new Member(); // we cannot create objects for abstract class 
		Teacher t1=new Teacher();
		Students s1=new Students();
		Member m[] = new Member[5];
		m[0]=new Students();
		m[1]=new Students();
		m[2]=new Teacher();
		m[3]=new Teacher();
		m[4]=new Students();
		
		for (Member m1:m) {
			m1.welcomeMessage();
		}
		
// Area of triangle and rectangle 
//		Triangle tri=new Triangle();
//		System.out.println("Area of Triangle is : "+tri.area(2, 3));
//		
//		Rectangle rec=new Rectangle();
//		System.out.println("Area of Rectangle is : "+rec.area(2, 3));	
		
		Shape shape[]=new Shape[2];
		shape[0]=new Triangle();
		shape[1]=new Rectangle();
		
		for(Shape sp:shape) {
			sp.displayShape();
		}
		
		

	}

}
