package BasicJava;
import java.util.*;
public class NumOfDigitsUsingMethod {
			
			static int digit(int n) {
			    int count = 0;
			    
			    while (n != 0) {
			      // n = n/10
			      n /= 10;
			      ++count;

			      
			    }
			   
				return count;
				}

				public static void main(String []args){
				    System.out.println("Hello, Samyuktha!");
				    
				    Scanner sc=new Scanner(System.in);
				    System.out.print("Enter the digits: ");
				    int n=sc.nextInt();
				    int out=digit(n);
				    System.out.println("Number of digits: " + out);

	}

}
