package examples;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkFour {

	public static void run () {
		
	           float[] arr = new float[7];
	
	           float min = -10.0f;
	           float max = 20.0f;
	           float diff = max - min;
	           Random random = new Random();
	           for(int i = 0; i < arr.length; i++) {
		       arr[i] = random.nextInt( (int) (diff + 1));
                  }
               System.out.println("Temperatures Week : "+Arrays.toString(arr));
	}

}
