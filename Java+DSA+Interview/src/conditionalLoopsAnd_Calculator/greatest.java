package conditionalLoopsAnd_Calculator;

import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c=sc.nextInt();
		
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println(max);
	}

}
