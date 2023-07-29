package DSA;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapandHashSet {

	public static void main(String[] args) {
		
		//HashMap - If key is the main priority then we use HashMap, Keys cannot be duplicate
		
		HashMap<String, Integer> hm = new HashMap<>(); 
		
		// add - O(1)
		hm.put("India",132);
		hm.put("Pakistan",32);
		hm.put("Nepal",3);
		hm.put("USA",22);
		hm.put("China",135);
		hm.put("Australia",4);
		
		//Traversal  - O(n)
		
		System.out.println("Strings of HashMap : ");
		for(String s : hm.keySet()) { // Strings in HashMap
			System.out.println(s);
		}
		
		//size - 0(1)
		System.out.println("Size of HashMap : "+hm.size());
		
		//get - O(1)
		System.out.println("Get an value of an element : "+hm.get("India"));
		
		//check - O(1)
		System.out.println("Check if a Key is there in HashMap : "+hm.containsKey("India"));
		System.out.println("Check if a Value is tehre in hashMap: "+hm.containsValue(6));
		
		//remove - 	O(1)
		System.out.println("Remove a Key-Value in HashMap : "+hm.remove("Pakistan"));
		
		//replace - O(1)
		System.out.println("Replace a Value for a key in HashMap : "+hm.replace("India",142));
		System.out.println("Replaced Value for a key in HashMap : "+hm.get("India"));

		
		//Max Frequency of a character
		
		String s = "aabdabcdbacdbb";
	
		MaxChar(s);
		
		
		//Get Common elements in two array - O(n+n)
		
		int arr1[] = {5,8,9,6,3,2,10};
		int arr2[] = {9,7,1,5,2,14,20};

		System.out.print("Common elements in arr1:[ ");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		System.out.print("] & arr2:[ ");
		for(int j:arr2) {
			System.out.print(j+" ");
		}
		System.out.print("] is : ");
		
		Common(arr1,arr2);
	
	
//------------------------------------------------------------------------------------------------------------------
		
	//hashSet - If value is the main priority we use hashSet, values cannot be duplicates
	
	HashSet<Integer> hs = new HashSet<>(); 
		
		// add 
		
		hs.add(2);
		hs.add(4);
		hs.add(6);
		hs.add(8);
		hs.add(10);
		
		
		//size - 0(1)
		System.out.println("\nSize of HashSet : "+hs.size());
		
		//check - O(1)
		System.out.println("Check if a value is there in HashSet : "+hs.contains(4));
		
		//remove - 	O(1)
		System.out.println("Remove a Value in HashSet : "+hs.remove(10));
		
		
		//First Repeating Character		
	
		String str = "samyuktha";
		Repeat(str);
	}
	
	
//-----------------------------------------------------------------------------------------------------------------
								//HashMap
//-----------------------------------------------------------------------------------------------------------------
		
		//Max Frequency of a character
		
		public static void MaxChar(String s) {
			
			HashMap<Character, Integer> mc = new HashMap<>();
			
			for(int i = 0;i<s.length();i++) {
				char c = s.charAt(i);
				
				if(mc.containsKey(c)==true) {
					int cMax = mc.get(c);
					mc.put(c, cMax+1);
				}
				else {
					mc.put(c, 1);
				}
			}
			
			int maxVal = 0;
			char maxChar = 'a';
			
			for(char ch : mc.keySet()) {
				if(mc.get(ch)>maxVal) {
					maxVal = mc.get(ch);
					maxChar = ch;
				}
			}
			
			System.out.println("Maximum Charater in a  String is : "+maxChar);
			
		}	

//---------------------------------------------------------------------------------------------------------------
		//Get Common elements in two array
		
		public static void Common(int arr1[], int arr2[]) {
			
			HashMap<Integer, Integer> mc = new HashMap<>();
			
			for(int i = 0;i<arr1.length;i++) { //storing elements in hashMap
				mc.put(arr1[i], 1);}
			for(int i = 0;i<arr2.length;i++) { //comparing arr2 with hashMap elements
				if (mc.containsKey(arr2[i])) {
					System.out.print(arr2[i]+" ");
				}
			}
		}
			
			
//-----------------------------------------------------------------------------------------------------------------
								//HashSet
//-----------------------------------------------------------------------------------------------------------------
		//First Repeating Character		
		
		public static void Repeat(String str) {
			
			HashSet<Character> chart = new HashSet<>();
			
			for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(chart.contains(ch)) {
				System.out.println("First Repeated Character is : "+ch);
				return;
			}
			else {
				chart.add(ch);
				}
			}
				System.out.println("No Repeating Characters");
				System.out.println("Samyuktha");
	}
}

