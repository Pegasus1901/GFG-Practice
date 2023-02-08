package unknown;

import java.util.Scanner;

public class StringCounter {

	public static void main(String[] args) {
		 String str = "aabbcddd";
		 
		    int[] counts = new int[(int) Character.MAX_VALUE];
		    

		    for (int i = 0; i < str.length(); i++) {
		        char charAt = str.charAt(i);
		        counts[(int) charAt]++;
		    }

		    for (int i = 0; i < counts.length; i++) {
		        if (counts[i] > 0)
		            
		            System.out.print(""+ counts[i] + (char) i + "");
		    }
	}

}
