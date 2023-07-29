package BasicJava;


enum Level{ // enum is a constant variable defined for the entire class. It is inherited from *Enum* super class.
	
	Beginner("B"), Intermidiate("I"), Advance("A"), Proficiency("P");
	
	String abbr;
	
	Level(String ab){
	abbr=ab;
	}
	
	public String getAbbr(){
		return abbr;
	}
}

public class Enum {


	public static void main(String[] args) {

		Level l0 = Level.Beginner;
		Level l1 = Level.Intermidiate;
		Level l2 = Level.Advance;
		Level l3 = Level.Proficiency;
		Level l4 = Level.Beginner;
		
		System.out.println(l1.getAbbr()); // calling method *getAbbr*
		
		System.out.println(l3.ordinal()); // Returns an integer value equivalent to the String eg., Beginner = 0, Intermediate = 1 and Advance = 2..

		System.out.println(l0.name()); // Returns the name of the constant.
		
		System.out.println(l4.hashCode());
		
		System.out.println(l4.compareTo(l1)>1);
		
		
	}

}
