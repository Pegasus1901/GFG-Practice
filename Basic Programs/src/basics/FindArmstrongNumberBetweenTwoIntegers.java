package basics;

import java.io.*;
import java.math.*;

public class FindArmstrongNumberBetweenTwoIntegers {
	
	static void armstrong(int l, int h) {
		
		for(int j=l+1; j<h;++j) {
			int y=j;
			int N=0;
			while(y!=0) {
				y/=10;
				++N;
			}
			int sum=0;
			y=j;
			while(y!=0) {
				int d = y%10;
				sum+=Math.pow(d, N);
				y/=10;
			}
			if(sum==j) {
				System.out.println(j+" ");
			}
		}
	}

	public static void main(String[] args) {
		int n1=50;
		int n2=500;
		
		armstrong(n1, n2);
		System.out.println();
	}

}
