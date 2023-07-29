package BasicJava;

public class MethodOverloading {
	
	static int max(int a, int b) {
		return a>b?a:b;
	}

	static char max(char a, char b) {
		return a>b?a:b;
	}
	
	static int avg(int a, int b, int c) {
		return (a+b+c)/3;
	}
	public static void main(String[] args) {
		System.out.println("Max for 2 numbers is : "+max(2,3));
		System.out.println("Max for 2 charcterters is : "+max('s','d'));
		System.out.println("Average of three numbers is : "+avg(4,6,8));

	}

}
