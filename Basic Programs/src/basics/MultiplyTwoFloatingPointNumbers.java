package basics;

import java.util.Scanner;

public class MultiplyTwoFloatingPointNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter First Number- ");
		float a= sc.nextFloat();
		System.out.print("Enter Second Number- ");
		float b= sc.nextFloat();
		
		System.out.println("Multiplication of two numbers is- " + (a*b));
	}

}
