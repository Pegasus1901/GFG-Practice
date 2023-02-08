package tcs;

import java.util.*;

public class Cycle {

	public static void main(String args[]){
	      Scanner sc = new Scanner(System.in);
	      
	      // "Enter the required size of the array ::"
	      int size = sc.nextInt();
	      int [] board = new int[size];
	      int[] stud= new int[size];
	      int beats=1;
	      
	      //fill students
	      for(int i=1;i<=size;i++) {
	    	  stud[i-1]=i;
	      }
	      
	      //Enter elements of the array
	      for(int i=0; i<size; i++){
	         board[i] = sc.nextInt();
	      }
	      
	      //board = stud
	      for(int j=0;j<size;j++) {
	    	  
//	    	  for(int num: board) {
//	    		  stud[j]=num;
//	    		  System.out.println(num);
//	    	  }
	    	  
	    	  beats++;
	      }
	      for (int number: stud) {
	          System.out.println(number);
	        }
	      
	      
	      
	      //System.out.println("Contents of the array: "+Arrays.toString(myArray));
	      
	     /* int temp = stud[size-1];
	      for(int i = size-1; i>0; i--){
	         stud[i] = stud[i-1];
	      }
	      
	      
	      stud[0] = temp;
	      System.out.println("Contents of the cycled array: "+Arrays.toString(myArray));*/

}
}
