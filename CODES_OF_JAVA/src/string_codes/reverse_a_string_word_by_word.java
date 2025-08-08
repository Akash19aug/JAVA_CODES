package string_codes;

public class reverse_a_string_word_by_word {

	public static void main(String[] args) {
		
		String s = "today is saturday";
		
		String[ ] sarray = s.split(" ");
		
//		for(String a : sarray) {
//			System.out.println(a);
//		}
		for(int i=sarray.length-1;i>=0;i--) {
			
			System.out.print(sarray[i]+" ");
		}
		
		

	}

}
