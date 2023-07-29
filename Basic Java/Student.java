package BasicJava;
import java.util.*;

class Marks{
	int math,chem,phy;
//	int classC;
//	String section;
	
	
	static int add(int math,int phy,int chem) {
	
			int score=(math+phy+chem)/3;
	
		if (score>=80){
			System.out.println("Result : Excellent");
		}
		else if(score<80&&score>=60) {
			System.out.println("Result : Good");
		}
		else if(score<60&&score>=40) {
			System.out.println("Result : Passed");
		}
		else {
			System.out.println("Result : Failed");	
		}
		return score;
		
	}
	
	int Marks(int bio,int zoo,int bot) { // Calling constructor as method
		
		int score=(bio+zoo+bot)/3;

	if (score>=80){
		System.out.println("Result : Excellent");
	}
	else if(score<80&&score>=60) {
		System.out.println("Result : Good");
	}
	else if(score<60&&score>=40) {
		System.out.println("Result : Passed");
	}
	else {
		System.out.println("Result : Failed");	
	}
	return score;
	
}


}
public class Student {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		Marks student1=new Marks();		
		Marks student2=new Marks();

       
		System.out.print("Enter Student Roll Number: ");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name=sc.nextLine();
        
       if(num==123) {
            System.out.println("Enter Student Marks");
            System.out.print("Biology: ");
            int bio=sc.nextInt();
            System.out.print("Zoology: ");   
            int zoo=sc.nextInt();
            System.out.print("Botony: ");
            int bot=sc.nextInt();
            
            System.out.println("Roll Number of the Student : "+num);
            System.out.println("Name of the Student : "+name);

            if(bio>=40&&zoo>=40&&bot>=40) {
            System.out.println("Total Marks Obtained :"+student2.Marks(bio,zoo,bot)+"/100");} 
            else {
            System.out.println("Result : You are not Eligible! You Failed a Subject");
            } }
      
       else if(num==456) {	
        
        
        System.out.println("Enter Student Marks");
        System.out.print("Mathematics: ");
        int math=sc.nextInt();
        System.out.print("Physics: ");   
        int phy=sc.nextInt();
        System.out.print("Chemistry: ");
        int chem=sc.nextInt();
        

        System.out.println("Roll Number of the Student : "+num);
        System.out.println("Name of the Student : "+name);

        if(math>=40&&phy>=40&&chem>=40) {
        System.out.println("Total Marks Obtained :"+student1.add(math,phy,chem)+"/100");}
        else {
        System.out.println("Result : You are not Eligible! You Failed a Subject");
        }       	
       }
       
       else {
    	   System.out.println("Enter Valid Roll Number");}
       
   

       

	}

}
