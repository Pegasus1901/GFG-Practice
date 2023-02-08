package tcs;

import java.util.Scanner;

public class KhoKho {
	
	
	public void fun() {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
	
		int[] d= new int[n];
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			d[i]=a;
		}
		for(int x:d) {
			System.out.println(x);
		}
	}

}
