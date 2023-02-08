package atos;

import java.util.*;


public class Penalty {
		public static void main (String[] args) throws Exception
		{	
			int n = 3;	
			int[] arr = new int[] { 1,3,2 };
			int count =0;
			
			Arrays.sort(arr);
			
			int minPenalty = 0;
			
			for(int i=0; i<n-1; i++) {
			    minPenalty += Math.abs(arr[i] - arr[i+1]);
				count++;
			}
			System.out.println(count);
		}
	}
