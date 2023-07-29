package BasicJava;

public class CommandLineArg { // passing arguments from command prompt to java program
	
	 //Variable Arguments - SE 5.0
	
	//Single data type or variable as an argument
	static int maxValue(int...vals) { // pass n number of arguments, Creates Default array
		int max=Integer.MIN_VALUE;
		for(int k:vals) {
			if(k>max)
			max=k;
		}
		return max;	
	}
	
	//Multiple data type or variable as an argument
	
		static int minValue(char a,double b,String c,int...vals) { // pass n number of arguments, Creates Default array
			int min=Integer.MAX_VALUE;
			for(int k:vals) {
				if(k<min)
				min=k;
			}
			return min;	
		}

		
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) { //passing arguments through command arguments
			System.out.println(args[i]);
		}
		int m = minValue('s',0.4,"samyuktha",5,1);
		System.out.println("Minimum value : "+m);
		
		int n = maxValue(7,9,-4,6,0);
		System.out.println("Maximum value : "+n);

	}

}