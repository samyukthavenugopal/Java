package BasicJava;
import java.util.*;

 class Lib{
		int userId;
		String bookName;
		String message;
		int date;
		
		
		int dates(){ //using object
			return date*2;
		}
		
//		static int dates(int date){//using method
//			return date*2;
//		}
	 }

 
public class Library {
	public static void main(String []args){
	      System.out.println("Hello, Samyuktha!");
	 
	      
	      Scanner sc=new Scanner(System.in);
	      
	   Lib one= new Lib();
	   Lib two= new Lib();
	   Lib three= new Lib();
	   
	   Lib returns=new Lib();//method
	   returns.date=7;


//	   System.out.print("Enter the Duration in days : ");
//	   int date=sc.nextInt(); 
//	   int returns=Lib.dates(date);

	   
	   one.userId=123;
	   one.bookName="harry potter";
	   one.message="You Returned the Book";
	   
	   two.userId=456;
	   two.bookName="Alice in Wonderland";
	   two.message="You did not Return the Book";
	   
	   three.userId=789;
	   three.bookName="Snow White";
	   three.message="Your due date is for returning the Book is expiring in ";
	   
	   
	   System.out.print("Welcome, Enter you User Id : ");
	   int id=sc.nextInt();
	   
		   if (id==123) {
			   System.out.println("\n User Id : "+one.userId+"\n Book Name : "+one.bookName+"\n Details : "+one.message);}
		   else if (id==456) {
			   System.out.println("\n User Id : "+two.userId+"\n Book Name : "+two.bookName+"\n Details : "+two.message);}
		   else if (id==789){
		   	   System.out.println("\n User Id : "+three.userId+"\n Book Name : "+three.bookName+"\n Details : "+three.message+returns.dates()+" days");}
		   else
			   System.out.println("Enter Correct User Id");	

}
}
