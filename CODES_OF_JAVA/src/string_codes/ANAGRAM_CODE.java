package string_codes;

public class ANAGRAM_CODE {
	public static void main(String[] args) {

		String S1 = "dog";   
		String S2 = "god";
		if (S1.length() != S2.length()) {
			System.out.println("not a anagram");
		} else {
			String A1 = S1.toLowerCase();
			String A2 = S2.toLowerCase();   

			char[] data = new char[26];
			for (int i = 0; i < A1.length(); i++) {
				data[A1.charAt(i) - 'a']++;
				data[A2.charAt(i) - 'a']--;

			}
			boolean is_anagram = true;
			for (int j = 0; j < data.length; j++) {
				if (data[j] != 0) {

					is_anagram = false;
					break;
				}

			}
			if (is_anagram==true) {
				System.out.println("it is angramm");
			} else {
				System.out.println("it is nnooyt angramm");

			}

		}
	}

}
