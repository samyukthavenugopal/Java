package BasicJava;
// cloning one object to another

class Department implements Cloneable{ // Deep Copy - to copy the entire object without indicating the reference of the object 
									//we deep copy and create an separate object.
	int deptId;
	String name;
	
	Department(int dId, String n){
		deptId = dId;
		name = n;
	}
	
	Department(Department d){
		this.deptId=d.deptId;
		this.name=d.name;
	}
	
	void display() {
		System.out.println("Department Id : "+deptId);
		System.out.println("Department name : "+name);
	}
	
	protected Object clone() throws CloneNotSupportedException { // override the clone method from object class
		return super.clone();
	}
	
}

class Studentt implements Cloneable{ // providing permission within the class to allow cloning.
	int stdId;
	String name;
	Department dept;
	
	Studentt(int sId, String n, Department d){
		stdId = sId;
		name = n;
		dept = d;
	}
	
	Studentt(Studentt s){ // copy constructor
		this.stdId=s.stdId;
		this.name=s.name;
		this.dept=(Department)s.dept;
	}
	
	void display() {
		System.out.println("Student Id : "+stdId);
		System.out.println("Student name : "+name);
		dept.display();
	}
	
	protected Object clone() throws CloneNotSupportedException { // override the clone method from object class
		Studentt s =(Studentt)super.clone(); 
		// we cast the Student class to return an Student object as Shallow copy and store it in object *s*
		// super refers to the base or super class *Department* 
		// though the Student class does not extend the base class by default every child class extends the parent class.
		// to use clone() method we must implement it in the class using an interface *Cloneable*.
		s.dept = (Department)s.dept.clone();
		// to create a deep copy we invoke the clone method in the Department class which creates a copy for the department object.
		return s;
	}
}

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department dept = new Department(12, "CSE");
		Studentt s1 = new Studentt(121,"Sara", dept);
	
		Studentt s2=s1; // s2 and s1 refers the same address
		
		Studentt s3=(Studentt)s1.clone(); // since clone is an object we must explicitly cast the student object to receive our desired result.
		s3.name="thara"; // name is changed in the s3 objects because strings are immutable and a new object is created for it.
		dept.name="IT"; // Shallow copy - department name for both the objects s1 and s3 are changed because both refers the same object
//		s3.dept.name="ECE"; // this will change the name only in s3 as it is a separate cloned object and not related with any reference in s1.
		
		Studentt s4 = new Studentt(s1); // copy Constructor
		
		System.out.println("--------------------------------------\ns1 Object\n--------------------------------------");
		s1.display(); // Deep copy - the name of the department in s1 has changed but not in s3.
		
		System.out.println("--------------------------------------\ns2 Object - copy's the reference of s1\n--------------------------------------");
		s2.display();
		
		System.out.println("--------------------------------------\ns3 Object - clones the object s1 with deep copy\n--------------------------------------");
		s3.display(); // only primitive data types such as int, float, char.. are cloned and 
		// other data types like strings and objects are copied as a reference which refers to the same address.
		
		System.out.println("--------------------------------------\ns4 Object - using copy constructer\n--------------------------------------");
		s4.display();
	
	
	}

}
