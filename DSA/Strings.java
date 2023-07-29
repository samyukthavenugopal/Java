package DSA;

public class Strings {

	public static void main(String[] args) {
		
// Remove Vowels from String
		
//		String s = "Welcome To Strings";
//		System.out.println(s);
////		System.out.println(s.replace("ings", ""));
//		
////		
//		for (int i =0;i<s.length();i++) {
//			char c = s.charAt(i);
//			if( c=='a' || c=='A' || c=='e' || c =='E' || c=='i' || c=='I' 
//								|| c=='o' || c=='O' || c=='u' || c=='U') {
//			continue;}
//			System.out.print(c);
//		}
			
			
// Reverse Vowels of String
		
//		String s = "Welcome To Strings";
//		System.out.println(s);
//		
//		char[] c = s.toCharArray();
//		
//		int i = 0, j = c.length-1;
//		
//		while(i<j) {
//		while( c[i] != 'a' && c[i] != 'A' && c[i] != 'e' && c[i] !='E' && c[i] != 'i' && c[i] != 'I' 
//		&& c[i] != 'o' && c[i] != 'O' && c[i] != 'u' && c[i] != 'U') 
//		{
//			i++; }
//		
//		while( c[j] != 'a' && c[j] != 'A' && c[j] != 'e' && c[j] !='E' && c[j] != 'i' && c[j] != 'I' 
//				&& c[j] != 'o' && c[j] != 'O' && c[j] != 'u' && c[j] != 'U') 
//		{
//			j--; }
//		
//		if(i>=j) {
//			break;
//		}
//		
//		char ch = c[i];
//		c[i] = c[j];
//		c[j] = ch;
//		
//		i++;
//		j--;
//		
//		}
//		
////		for(char ch : c)
//		System.out.print(c);
	
		
// Convert all Uppercase to Lowercase in a String
		
		String str = "Welcome To Strings";
		System.out.println(str);
		
		char[] s = str.toCharArray();
		
		for (int i =0;i<s.length;i++) {
			char c = s[i];
			
			if(c>='A' && c <='Z') {
			char res = (char)(c - 'A' + 'a');
			s[i]= res;
			}
			
		}
		System.out.print(s);
		
		
		
		
		
		
		
		
		
	}

}

