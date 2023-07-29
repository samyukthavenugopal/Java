package BasicJava;

import java.util.Scanner; // package utility(scanner,array,date...) nested package or hierarchical package
import static java.lang.Math.sqrt; //Static import need not specify the entire package name *Math.sqrt(2)* instead *sqrt(2)* will do

public class Method {
	int length, bredth, height; // if the data is not defined static then it creates memory for each object called.
	// when an object is created only then the variable is created in memory
	static int boxCount; // creating a static variable or data creates a common memory for the entire class and its objects called.
	// but static variable is created when the class id loaded.
	
	
	static{ // static method is executed before creating the first object.
		System.out.println("From static Block");
		boxCount=0;
		System.out.println(sqrt(9)); // static import
		System.out.println(java.lang.Math.pow(4,2)); // without importing the package
	}
	
	static void displayCount() { // Non static variable or method cannot be accessed within static block.
		System.out.println("Box Count : "+boxCount); //need not specify class name while calling static method within the class
	}
	
	//using Integer return type
	
	static int box(int length, int bredth, int height) {
		return length*bredth*height;
		
		}
	
	Method (int l, int b, int h) {
		length=l;
		bredth=b;
		height=h;
		
		boxCount++;
		
		}
	
//using void return type
	
//	static void blackBox(int length, int bredth, int height) {
//		System.out.println(length*bredth*height);
//		}
	
	
	//comparing two objects
	
	boolean isEqual(Method compare){
		if (length == compare.length && bredth == compare.bredth && height == compare.height) 
			return true;
		
		return false;
		
	}
	
	static void println() {
		System.out.println("-----------------------------------");
	}
	
	//Copy Constructor
	
	Method(Method copy){
		length=copy.length;
		bredth=copy.bredth;
		height=copy.height;
		boxCount++;
		
	}
	

	// Doubling the object values
	
	Method doubleBox() {
		Method temp= new Method(2*length,2*bredth,2*height);
		return temp;
		
	}
	
	
		public static void main(String []args){
		    System.out.println("Hello, Samyuktha!");
		    println();
				    
		    
		    
//using Integer return type
		    
//creating Object 
		    
		//by calling class name as method  
		Method blueBox=new Method(4,5,6);
		Method pinkBox=new Method(3,4,5);
		
	    System.out.println("blueBox == pinkBox : "+blueBox.isEqual(pinkBox)); //compare 2 objects
	       
	    Method copyBox=new Method(pinkBox); //Coping an object to another object
	    System.out.println("Area of the copyBox is : "+copyBox.box(2,3,4));
	    System.out.println("copyBox == pinkBox : "+copyBox.isEqual(pinkBox)); //compare 2 objects
	    
	    // Doubling the existing objects length, breadth and height
	    
	    Method db=blueBox.doubleBox();
	    System.out.println("Length, Bredth and Heigth of the blueBox is : "+blueBox.length+","+blueBox.bredth+","+blueBox.height);
	   // Double of blueBox
	    System.out.println("Length, Bredth and Heigth of the DoubleBox is : "+db.length+","+db.bredth+","+db.height);
	    
	    
	    
	    //by calling Method name 
	    
		System.out.println(blueBox.box(3,3,3));
		System.out.println(pinkBox.box(2,2,2));
		
		    
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter length, bredth and height :  ");
		   int length=sc.nextInt(); 
		   int bredth=sc.nextInt(); 
		   int height=sc.nextInt(); 
		   int area=box(length,bredth,height);
		   System.out.println("Area of the Box is : "+area);

		   System.out.println("Constructor or Box Count : "+Method.boxCount); // Static variable are called with class name
		   displayCount(); 
		   
		   println();
		   
		    
//using void return type
		    
//		   blackBox(4,5,6);
		   
//		   
}
}
