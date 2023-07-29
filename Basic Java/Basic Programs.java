package BasicJava;
import java.util.*;
public class First {

	public static void main(String[] args) {
		
//		System.out.println("Hai, Enter your Name");
//		Scanner sc=new Scanner(System.in);
//		String name= sc.nextLine();
//		System.out.println("Hai, "+name);
		
		
//		Nested Loops
//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the numer of lines");
//		int line=sc.nextInt();
//		System.out.println("Enter the numer of Stars");
//		int star=sc.nextInt();
//		for(int i=1;i<=line;i++){
//		   for(int j=1;j<=star;j++){
//		      System.out.print("* ");
//		   }
//		   System.out.println();
//		}
//
//		Pyramid pattern
//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the numer of lines");
//		int line=sc.nextInt();
//		System.out.println("Enter the numer of Stars");
//		int star=sc.nextInt();
//		for(int i=1;i<=line;i++){
//		   for(int j=1;j<=i;j++){
//		      System.out.print("* ");
//		   }
//		   System.out.println();
//		}
//
//		Missed star pattern - Loop Controlled Statements
//
//		int i,j;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the numer of lines");
//		int line=sc.nextInt();
//		System.out.println("Enter the numer of Stars");
//		int star=sc.nextInt();
//		// outloop: //- loop label like goto in other languages which is used to jump between statements.
//		for(i=1;i<=line;i++){
//		   for(j=1;j<=star;j++){
//		      if (i==3 && j==3)
//		      continue; //- Skips the condition in the loop
//		      // break outloop; //- labled break 
//		      System.out.print("* ");
//		   }
//		   System.out.println();
//		}
//
//
//		Mutiples in pattern
//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of lines");
//		int line=sc.nextInt();
//		System.out.println("Enter the number of Stars");
//		int star=sc.nextInt();
//		for(int i=1;i<=line;i++){
//		   for(int j=1;j<=star;j++){
//		      System.out.print(i*j+" ");
//		   }
//		   System.out.println();
//		}
//
//
//		Nearest number - Loop Control - Break
//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number ");
//		int n=sc.nextInt();
//		while(true){
//		   if ((n%10)==0){
//		   System.out.println(n);
//		      break;
//		   }
//		   n--;
//		}
//
//
//		Perfect Square or Not using while
//
//		   int i=1;
//		   Scanner sc=new Scanner(System.in);
//		   System.out.println("Enter a number ");
//		   int n=sc.nextInt();
//		   while(i*i<=n){
//		      if((n%i==0) && (n/i==i))
//		      System.out.println("Perfect Square");
//
//		      i++; 
//		   }System.out.println("Not a Perfect Square");
//
//
//		Perfect Square or Not Using SQRT Function
//
//		   Scanner sc=new Scanner(System.in);
//		   System.out.println("Enter a number ");
//		   double n=sc.nextDouble();
//		   double sqrt=Math.sqrt(n);   
//		   // boolean r= ((sqrt - Math.floor(sqrt)) == 0);   
//		   if (((sqrt - Math.floor(sqrt)) == 0))
//		      // if (r=true)
//		         System.out.println("Perfect Square");
//		      else
//		    System.out.println("Not a Perfect Square");
//		  
//		  
//		Sum of entered numbers 
//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the numbers to Sum ");
//		int sum=0;
//		while(true){
//		   int n=sc.nextInt();
//		   if(n <= 0){
//		      System.out.println("You entered a number which is 'below 0' or 'equal to 0'");
//		      break;
//		   }
//		   sum = sum + n;
//		   System.out.println("Sum of the entered numbers is : "+sum);
//		}
//
//
//		Number is prime or not
//
//		int n,digit,sum=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the numbers to Sum ");
//		   n=sc.nextInt();
//		   
//		   while(n>0){
//		      digit = n % 10;  
//		      sum = sum + digit;  
//		      n = n / 10; }
//		       System.out.println("Sum of the entered numbers is : "+sum);
//		       
//		   if ((sum%3)==0){
//		      System.out.println("Prime");
//		   }else {System.out.println("Not Prime");}
//
//
//		Number divisible by 3 and 6 using *WHILE* loop
//
//		   int i=1;
//		   Scanner sc=new Scanner(System.in);
//		   System.out.print("Enter the number : ");
//		      int n=sc.nextInt();
//		   while(i<=n) {
//		   if (i%3==0 && i%6==0)
//		   System.out.print(i+" ");
//		   i++;
//		   }
//		   
//		   
//		Number divisible by 3 and 6 using *FOR* loop
//		    
//		      Scanner sc=new Scanner(System.in);
//		      System.out.print("Enter the number : ");
//		       int n=sc.nextInt();
//		      int sum=0;
//		      		System.out.println("Not Divided by 3 & 6: ");	
//		       for(int i=1;i<=n;i++){      sum=sum+1;
//		         if (i%3==0 && i%6==0)
//		   continue;
//		          System.out.print(sum+" ");
//		         //  System.out.print("Divided by 3 & 6: \n");	
//		         //  System.out.print(i+" ");
//		       }		System.out.println("\n");
//		   
//		   
//		Array and loops
//
//		      int a[]=new int[6];
//		      Scanner sc=new Scanner(System.in);
//		      System.out.print("Enter the numbers : ");
//		      for(int i=0;i<a.length;i++)
//		       a[i]=sc.nextInt();
//		      for(int i=0;i<a.length;i++)
//		      System.out.print(a[i]+" ");
//		      
//		Sum of entered number using array

//		      int sum=0;
//		      int a[]=new int[5];
//		      Scanner sc=new Scanner(System.in);
//		      System.out.print("Enter the numbers : ");
//		      for(int i=0;i<a.length;i++)
//		       a[i]=sc.nextInt();
//		      for(int i=0;i<a.length;i++)
//		      sum=sum+a[i];
//		      //for(int x:a) //for each loop
//		      //sum=sum+x;
//		      System.out.println("Sum of array : "+sum);
////
//		Sum of Diagonal elements in array
//
//		         int[][] a=new int[3][3];
//		         int sum=0,n=1;
//		         for(int i=0;i<3;i++){
//		            for(int j=0;j<3;j++){
//		               a[i][j]=n;
//		               ++n;
//		            }
//		         }
//		            for(int i=0;i<3;i++){
//		               for(int j=0;j<3;j++){
//		               //System.out.print(a[i][j]+" ");
//		               while (a[i]==a[j]){
//		                  for(int x:a){
//		                  sum=sum+x;}
//		                  System.out.print(sum+" ");
//		               }
//		            System.out.println();
//		                  
//		               }
//		            }
		        

	      
	      

		
		
		  
		  
	}

}
