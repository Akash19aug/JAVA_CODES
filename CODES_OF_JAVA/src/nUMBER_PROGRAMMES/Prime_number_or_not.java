package nUMBER_PROGRAMMES;

public class Prime_number_or_not {

	public static void main(String[] args) {
		
		String s = "12";
		
		 int i = Integer.valueOf(s);
		 
		 boolean data = true;
		 if(i<=1) {
			 data = false;
		 }else {
		 for(int k = 2;k<i/2;k++) {
			 
			 if(i%k==0) {
				 data = false;
				 break;
			 }
		 }
		 
		 }
		 
		 if(data) {
			 System.out.println("prime");
		 }else {
			 System.out.println("non prime");
		 }
	
	}

	
}


