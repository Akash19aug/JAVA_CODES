package array;

public class Convert_int_into_integer_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int akash = 14927968;
	        String numStr = Integer.toString(akash);

	        int[] digits = new int[numStr.length()];
	        for (int i = 0; i < numStr.length(); i++) {
	            digits[i] = numStr.charAt(i) - '0';  // Convert char to int
	        }

	        // Print the array
	        for (int digit : digits) {
	            System.out.print(digit + " ");
	        }

	}

}
