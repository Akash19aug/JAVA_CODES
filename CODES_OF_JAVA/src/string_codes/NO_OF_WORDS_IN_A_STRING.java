package string_codes;

import java.util.Scanner;

public class NO_OF_WORDS_IN_A_STRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter sentence");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] words = input.trim().split(" ");
		

		System.out.println("no of words in string are : "+words.length);
		

	}

}
