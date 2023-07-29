import java.lang.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String str=sc.next();
		String orgStr=str;
		String rev="";
		int len = str.length();
		for( int i=len-1;i>=0;i--){
		    rev=rev+str.charAt(i);
		}
		if(orgStr.equals(rev)){
		    System.out.println(orgStr+" is a palindrome string");
		}
		else{
		    System.out.println(orgStr+" is not a palindrome string");
		}
	}
}

