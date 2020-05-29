package examples;

public class ArrayExampleOne {

       final static int NUMBER = 1;
       
       public static void run() {
    	   System.out.println("Example "+NUMBER+" Start");
    	   int[] integers = { 10, -20, 30, -40, 50 };
    	   integers[2] += 10;
    	   for (int i : integers) {
		   System.out.println(i);
		    }
    	   System.out.println("Example "+NUMBER+" End");
      }
}
