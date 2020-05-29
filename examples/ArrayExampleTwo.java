package examples;

public class ArrayExampleTwo {

    final static int NUMBER = 2;
    
    public static void run() {
    	
 	   System.out.println("Example "+NUMBER+" Start");
 	   //temperatures
 	   float[]  temperaturesWeek = { -1.5f, 0.5f, 0.0f, 5.0f, -5.5f, 10.0f, -5.0f };
 	   String[] daysWeek = { "Mo","Tu","Wd","Th","Fr","Sa","Su" };
 	   
 	  
 	  for (int i = 0; i < daysWeek.length; i++) {
			String l = daysWeek[i];
 	        float k = temperaturesWeek[i];
 	        System.out.printf(l+"%6.1fC\n",k);
 	  }
 	   		
 	  /////////////////////min///////////////////
 	  float min = temperaturesWeek[0];
 	  float max = temperaturesWeek[0];
 	  for(int i = 1; i < temperaturesWeek.length;i++) {
 		  if(temperaturesWeek[i] < min ) {
 			  min = temperaturesWeek[i];
 		  }
 	  }
 	  /////////////max////////////////////////////
 	 for(int i = 1; i < temperaturesWeek.length;i++) {
		  if(temperaturesWeek[i] > max) {
			  max = temperaturesWeek[i];
		  }
	  }
 	  
 	  System.out.println("Maximal temperature is "+max);
 	  System.out.println("Minimal temperature is "+min);
 	  
 	  //////avg, sum////////////////
 	  float avg = 0;
 	  float sum = 0;
 	  
 	  for(float tw : temperaturesWeek) {
 		  sum += tw;//accumulator
 	  }
 	  avg = sum / temperaturesWeek.length;
 	  System.out.println("Average temperature : "+avg);
 	    
    	   
 	   System.out.println("Example "+NUMBER+" End");
}
}