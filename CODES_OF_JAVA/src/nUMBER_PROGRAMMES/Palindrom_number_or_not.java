package nUMBER_PROGRAMMES;

public class Palindrom_number_or_not {

	public static void main(String[] args) {
//	*********************method 1 by swapping techinque
//		Integer num = 2123212;
//		//check if it is palindrome or not
//		String s = String.valueOf(num);
//		System.out.println(s);
//		char[] data = s.toCharArray();
//		
//		int j = data.length-1;
//		for(int i =0;i<j/2;i++) {
//			
//		char temp = data[i];
//		data[i] = data[j];
//		data[j] = data[i];
//		j--;
//		}
//		
//		//****imp step converting char array into string
//		String f = new String(data);
//		System.out.println(f);
//		if(s.equals(f)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}

		
		///************method 2****** by reversing the string nd checking
	
		int num = 2221222;
		
		String ip = String.valueOf(num);
		
		StringBuilder st44 = new StringBuilder(ip);
		String op = st44.reverse().toString();//imp .tostring()" is requires a op of string builder is object
		
		if(ip.equals(op)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	
		
		

	}



}
