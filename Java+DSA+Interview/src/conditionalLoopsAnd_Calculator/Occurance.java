package conditionalLoopsAnd_Calculator;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = 412556;
		int count=0;
		while(a>0) {
			int rem = a%10;
			if(rem==5) {
				count++;
			}
			a=a/10;
		}
		System.out.println(count);
	}

}
