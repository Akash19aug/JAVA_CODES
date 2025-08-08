package string_codes;

import java.util.Arrays;

public class Occurences_of_character_string_withoout_loop {

	public static void main(String[] args) {
		String s = "javaa java again agian";
		
		
		String k = s.replace("a", "");
		System.out.println(k);
		System.out.println(s.length()-k.length());
		
			
		}

	}


