package array;

public class Sort_A_Array {
	public static void main(String[] args) {
		///bubble sort
		int[] a = {1,3,4,7,2,5,99};
		 int size = a.length;
		for(int i = 0;i<size;i++) 
		{
			for(int j = 0;j<size-1;j++) 
			{   
				if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}	
			
		}
		
		System.out.println("final sorted array is below");
		for(int e :a) {
			System.out.print(e+" ");
		}
		
		
		
		
	}

}
