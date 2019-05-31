package execute;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import algorithm.quickSort;
import algorithm.sentrybubbling;
import algorithm.twowaybubbling;

public class runAlgorithm {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
     public static void main(String[] arg) throws ParseException {  	  
    	  Random  r = new Random ();
    	  int[] random = new int[10000];
    	  for (int j=0;j<10000 ; j++) {
    		  random[j] = r.nextInt(500);
    	  }
    	  long startTime = System.currentTimeMillis();
    	  System.out.println(startTime);
    	  /**
    	   * ˫��ð������
    	   */
    	  //twowaybubbling twBubble = new twowaybubbling();
    	  //random = twBubble.run(random);
    	  /**
    	   * ����ǵ�˫������
    	   */
    	  //sentrybubbling sentryBubble = new sentrybubbling();  	  
    	  //random = sentryBubble.run(random);
    	  /**
    	   * ��������
    	   */
    	  quickSort quicksort = new quickSort();
    	  random = quicksort.run(random, 0, random.length-1);
    	  
    	  long endTime = System.currentTimeMillis();
    	  System.out.println(endTime);
    	  for(int i : random) {
    		  System.out.print(i+", ");
    	  }
    	  System.out.println("");
    	  System.out.print("Time cost " + (endTime-startTime) + "ms");
    	  
     }
}
 