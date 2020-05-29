package examples;

import java.util.Arrays;

public class HomeWorkOne {
	
	public static void run() {
		
		 int[] array = { 50,-10,40,-30,20,-70,90,-80 };
		 int[] integersNegative = new int[4];
		 int indexNegative = 0;
		 int[] integersPositive = new int[4];
		 int indexPositive = 0;
		 	
		 for (int i = 0; i < array.length; i++) {
		      if(array[i] >= 0){
		         integersPositive[indexPositive] = array[i];
		         indexPositive++;
		      }
		 }
		 for (int i = 0; i < array.length; i++) {
			 if (array[i] < 0) {
		    	  integersNegative[indexNegative] = array[i];
			         indexNegative++;
		      }
		 }
		
		 System.out.println("Negative numbers :"+Arrays.toString(integersNegative));
		 System.out.println("Positive numbers :"+Arrays.toString(integersPositive));
		 
	}
}
