package array;

import java.util.HashMap;
import java.util.Map;

public class TEST_ {

	public static void main(String[] args) {
		
		System.out.println("lets check github 1");
		System.out.println("lets check github 2");
		System.out.println("lets check github 3");
		
		System.out.println("lets check github X");
		System.out.println("lets check github Y");
		System.out.println("lets check github Z");
		
		// TODO Auto-generated method stub
       System.out.println("AKASH HAS STARTED WORKING");
       
       
       String words ="i am java java bro bro bro";
       
       String [] s = words.split(" ");
       
       Map<String,Integer> data = new HashMap<>();
       int maxcount = 0;
       String  maxword = null;
          for(String word : s) {
        	  
        	  data.put(word, data.getOrDefault(word, 0)+1);
        	  if(data.get(word)>1) {
        		     maxcount = data.get(word);
        		     maxword = word;
        		
        		  
        	  }
        	   
          }
          System.out.println(maxword +" = "+maxcount);
     //     System.out.println(data);
       
             
	}

}
