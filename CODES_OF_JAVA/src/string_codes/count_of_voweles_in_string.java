package string_codes;

import java.util.HashMap;
import java.util.Map;

public class count_of_voweles_in_string {

	public static void main(String[] args) {
		
		
		//METHOD 1  --     USING MAP ---count number of each vowel in a string
		
//		
		String s = "Akash is a imp guy";
		String k = s.replaceAll("\s", "").trim().toLowerCase();
		System.out.println(k);
		
		Map<Character,Integer> data = new HashMap<>();
		//int count = 0;
		for(char ch : k.toCharArray()) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				data.put(ch, data.getOrDefault(ch, 0)+1);
				
			}
			
		}
		
		System.out.println("each vowels count is below");
		for(Map.Entry<Character, Integer> items : data.entrySet()) {
			 
		System.out.println(items.getKey() +"---"+items.getValue());
		}
		 
		//USING NORMAL FOR LOOP ---count total number  vowels in a string
		
		
		//String D = "Akash is NOT a imp guy";
//		String F = D.replaceAll("\s", "").trim().toLowerCase();
//		System.out.println(F);		
//		int count = 0;
//		for(int i =0;i<F.length();i++) {
//			if(F.charAt(i)=='a'||F.charAt(i)=='e'||F.charAt(i)=='i'||F.charAt(i)=='o'||F.charAt(i)=='u') {
//				count++;
//			}
//				
//		}
//		System.out.println("total number of vowels in given string are "+count);
//		
//		
//		
//		  
		
		

	}

}
