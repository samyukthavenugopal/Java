package BasicJava;

class Employees{
	String name; 
	double salary;
	Employees(String n, double s){
		name=n;
		salary=s;}
	
	
	String getName() {return name;}
	void setName(String n) {name=n;}
	double getSalary() {return salary;}
	void setSalary(int s) {salary=s;}

	
	public boolean equal(Object obj){
		if(this==obj)
			return true;
		if (this==null)
			return false;
		
		if(this.getClass()!= obj.getClass()) {
			return false;
		}
		Employees e=(Employees)obj;
		return this.name.equals(e.name)&& this.salary==(e.salary);
	}
}

public class Objects {

	
	public static void main(String[] args) {
		String s1="Samyuktha";
		String s2="Samyuktha";
		
		String s3=new String("Samyuktha"); //creating a new object
		String s4=new String("Samyuktha");

		
		// compares two strings
		System.out.println("Comparing two Strings without creating an object : "+(s1==s2)); 
		
		// compares address of the two strings
		System.out.println("\nComparing two Strings in an object without equals method : "+(s3==s4));
		
		// compares two strings in the object using equals method
		System.out.println("Comparing two Strings in an object with equals method : "+s3.equals(s4)); 
		//equals method is stored in an inbuilt cosmic super class called object which is used to compare two strings
	
		Employees e1=new Employees("Shreya",25000);
		Employees e2=new Employees("Shreya",25000);

		System.out.println("\nComparing two Objects by creating a method in the class: "+e1.equals(e2));
		System.out.println("Comparing two Objects by creating a method in the class: "+e1.equal(e2));
		// if we try comparing the two object of Employees e1 and e2 though they are equal it displays false.
		// because the method equal is not specified in our class so it inherits the method equal from the cosmic super class defined for strings.
		// if we need to do a comparison for such objects we need to create and define a method for it.
		
		
	}

}
