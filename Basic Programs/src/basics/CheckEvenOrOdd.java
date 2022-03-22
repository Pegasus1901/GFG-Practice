package basics;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter number To Check Even Or Odd- ");
		int a= sc.nextInt();
		if(a%2==0) {
			System.out.println("Entered Number is Even...!");
		}else {
			System.out.println("Entered Number is Odd...!");
		}
		}

}