import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		int num=input.nextInt();
		int rev=0;
		while(num!=0){
		    rev=rev*10+num%10;
		    num=num/10;
		} 
    
    
		
		// Using StringBuffer
		
	/*	StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse(); */
		
		// Using StringBuilder
	
	/*  StringBuilder sb=new StringBuilder();
	    sb.append(num);
	    StringBuilder rev=sb.reverse(); */
	    
      
      
	    		System.out.println(rev); 
	    }
}

