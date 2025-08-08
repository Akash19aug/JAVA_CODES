package string_codes;

import java.util.HashMap;
import java.util.Map;

public class ocucrence_of_charcters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Abc   da";
		String j =s.toLowerCase();
		char[] words = j.toCharArray();
		
		HashMap<Character, Integer> wordscount = new HashMap<Character, Integer>();
		int max = 0;
		char maxkey = 0;
		
		for(char word : words) {
			wordscount.put(word,wordscount.getOrDefault(word, 0)+1);
			if(wordscount.get(word)>max) {
				
				max = wordscount.get(word);
				maxkey = word;
				
			}
			
		}
		System.out.println(maxkey+"-"+max);
		System.out.println(wordscount);

		
			
			
		}
		
		
		

	}


