package BasicJava;
import java.util.*;
						// we use *Comparable* to implement sorting in objects this must use *compareTo* method to write the functions for sorting.
class Employee implements Comparable<Employee>{ // Base class or Super class or parent class
		protected String name; // protected variable or class or method can be accessed within that class and the derived class, special access specifier for inheritance.
		private double salary;
		private String date;// if data is private it cannot be accessed in the derived class. It is only accessable though method
		final String COMPANY="ABC"; // final keyword is used when a variable is not to be changed and it is constant throughout the program. 
		//variable name is defined in caps and value cannot be changed. Method or Class can be set as final and it cannot be inherited or overrided.

		Employee(String n, double s,String d,String COMPANY){
			name=n;
			salary=s;
			date=d;}
		
		Employee(){ //Explicit Default Constructor without parameters for initializing if super keyword is not given in sub class.
			name=" ";
			salary=0;
		// when we try printing without inheriting name and salary from super class by default this constructor is executed and printed.
		}
		
		protected String getName() {return name;}
		protected void setName(String n) {name=n;}
		public double getSalary() {return salary;}
		public void setSalary(int s) {salary=s;}
		public String getDate() {return date;}
		public void setDate(String d) {date=d;}
	
		void raiseSalary(double percent) {salary +=salary*percent/100;}
		
		public void displayEmployee() {
			System.out.println("Name : "+name+"\nSalary : "+salary+"\nDate of Joining : "+date+"\nCompany : "+COMPANY);
			System.out.println("---------------");	
		}
		
		public int compareTo(Employee e) { // this displays the sorted salary for the Employee objects.
			if(salary==e.salary) 
				return 0;
			if(salary<e.salary) 
				return -1;
			else 
			return 1;
		}
			
//	    public int compareTo(Employee e) { // this displays the sorted name for the Employee objects.
//	        return this.name.compareTo(e.name);
//	    }
		
}
		
	
	class Manager extends Employee{ // Derived class or Sub class or Child class
		double bonus;
		
		Manager(String n, double s, String d, String C,double b){
			super(n,s,d,C); //inherit the private data from base class using super keyword			
			//if super class is not given, compiler implicitly creates an super class without parameters *super()* by default and try to call it. 
			//So we must manually initialize an constructor in such cases
			name=n; // protected class accessed in the derived class
			bonus=b;}
		
		void setBonus(double b) {
			bonus=b; }
			
		public double getSalary(){ // Method Overriding - inherit the predefined method in the base class 
			//and additional constraints can be added which can be executed within the inherited method 
			return super.getSalary()+bonus; //since the method *getSalary* is already defined in the base class we should use the super keyword to access it. 
		}
		
		public void displayManager() {
			System.out.println("Name : "+getName()+"\nSalary : "+getSalary()+"\nDate of Joining : "+getDate()+"\nCompany : "+COMPANY+"\nBonus : "+bonus);
			System.out.println("---------------");
			
		}

	}
	
	//class MultipleInheritance extends Employee,Manager{} // Multiple Inheritance is not performed in Java. To achieve multipleInheritance we must use Interface.
		
	
	public class Inheritance {
		
	final static String COMPANY = "ABC";

	public static void main(String[] args) {
		Employee e1=new Employee("Shreya",25000,"04-09-2001",COMPANY);
		e1.raiseSalary(10);
		System.out.println(e1.getSalary()); // access salary using getSalary since it is private.
		e1.displayEmployee(); 	
		
		Manager m1=new Manager("Riya",45000,"29-12-2004",COMPANY,5000);
		//m1.setBonus(4000);
		System.out.println(m1.getSalary());
		m1.displayManager();
		
		
		 // we can create an manager object and assign it to an employee object because manager *is* also an employee
		Employee e2=new Manager("Siya",30000,"16-06-1977",COMPANY,2000); // Polymorphic Behavior or polymorphism
		((Manager) e2).displayManager();
		//inheritance is an *is* relationship instance but we cannot create employee object and assign it to an manager object because employee *is not* an manager.
		//Manager m2=new Employee("Miya",15000,"29-11-2000"); // Shows error - Type mismatch: cannot convert from Employee to Manager.
	
	// To store multiple values we create an array
		
		Employee employees[]=new Employee[6];
		employees[0]= new Employee("Sara",10000,"11-07,2023",COMPANY);
		employees[1]= new Employee("Thara",20000,"12-08,2023",COMPANY);
		employees[2]= new Employee("Neha",30000,"13-09,2023",COMPANY);
		employees[3]= new Employee("Tina",40000,"14-10-2023",COMPANY);
		employees[4]= e1;
		employees[5]= e2;
		employees[5].setSalary(25000);// we can explicitly set salary for the manager object because it is referring the salary of super class.
		//the salary displayed is the setSalary defined plus the constraints in manager class(addition of bonus)
		//employees[4].setBonus(2000); //we cannot set bonus for the e2(manager object) because currently we are referring employee object which does not have a bonus method.
		//To achieve this we can cast the manager object to employee object
		
		System.out.println("Employee Details");
		System.out.println("----------------");
		for(Employee e:employees) { //Dynamic Binding - it might refer either employee or manager class.. when we try to invoke the getSalary() the overrided method function is printed.
			System.out.println("Name: "+e.getName()+" | Salary: "+e.getSalary()+" | DOJ: "+e.getDate()+" | Company: "+COMPANY);
			// getSalary() printed for e2(manager object in employee class) is the updated salary with bonus from sub class it is called as dynamic binding.
		}
		
	
//		int arr1[] = new int[] {4,7,5,2,9,10,3}; // normal sorting of integer arrays 
//		Arrays.sort(arr1);
//		for(int a:arr1) {
//		System.out.print(a+", ");	
//		}

		Arrays.sort(employees);// shows error because employees is an object with multiple variables, the compiler does not know in which format to sort
	// to implement this we need to use *compareTo* method to define the objects to compare. we add an interface *Comparable<objectName>* to the class that needs to to be compared.

		System.out.println("---------------------------------");
		System.out.println("Employee Details after Sorting Salary");
		System.out.println("---------------------------------");
		for(Employee e:employees) {
			System.out.println("Name: "+e.getName()+" | Salary: "+e.getSalary());
		}
	
	
	
	
	
	
	}

	}
