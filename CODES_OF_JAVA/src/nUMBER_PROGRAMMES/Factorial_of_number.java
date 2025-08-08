package nUMBER_PROGRAMMES;

public class Factorial_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		//4*3*2*1     n*n-1*n-2*n-3
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
			
		}
		
		System.out.println("factorial of  "+n+" is :"+fact);
		
		
	}

}
