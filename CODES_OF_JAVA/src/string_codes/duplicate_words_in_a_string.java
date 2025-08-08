package string_codes;

import java.util.HashMap;
import java.util.Map;
//COUNT OF DUPLICATE WORDS IN A STRING

public class duplicate_words_in_a_string {

	public static void main(String[] args) {
		
		String k = "taoday YAoooo";
		String s = k.toLowerCase();
		String n =s.replaceAll("\\s+","");
		
		char [] words = n.toCharArray();
		
	
		HashMap<Character,Integer> wordcount = new HashMap<Character,Integer>();
		Integer max = 0;
		Character maxkey=null;
		for(char word : words) {
			
			wordcount.put(word,wordcount.getOrDefault(word, 0)+1);
		//alternative for max
			if(wordcount.get(word)>max) {
				max=wordcount.get(word);
				maxkey=word;
			}
		}
		
		
		System.out.println(wordcount);
		System.out.println("Max is "+maxkey+" with occurence of "+max);

//		for(Map.Entry<Character, Integer> item:wordcount.entrySet()) {
//			if(item.getValue()>max) {
//				max=item.getValue();
//				maxkey=item.getKey();
//			}
//			
//		}
//		System.out.println("Max is "+maxkey+"with occurence of "+max);
//		
	//System.out.println(wordcount);
//		 // Display the result
//        for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
//        	    
//        	if(entry.getValue()>1) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//		
		

	}

	}
