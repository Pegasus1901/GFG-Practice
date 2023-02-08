package conditionalLoopsAnd_Calculator;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int rev=0;
		while(a>0) {
			int temp=0;
			temp=a%10;
			a/=10;
			rev=rev*10;
			rev+=temp;
		}
		System.out.println(rev);
	}

}
