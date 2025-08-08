package string_codes;

public class reverse_a_string {

	public static void main(String[] args) {
		
		String s = "today is saturday";
//	method 1	
		char [] c = s.toCharArray();
		
		for(int i=c.length-1 ; i>=0;i--) {
		System.out.print(c[i]);
		
		}
		//method 2
//		StringBuffer obj = new StringBuffer(s);
//		
//		System.out.println(obj.reverse());
//		

	}

	
}
