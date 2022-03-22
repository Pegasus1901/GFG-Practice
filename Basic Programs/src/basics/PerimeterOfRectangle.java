package basics;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int length,width;
		System.out.println("Enter length- ");
		length=sc.nextInt();
		System.out.println("Enter Width- ");
		width=sc.nextInt();
		System.out.println("Perimeter Of Rectangle "+2*((length+width)));
		sc.close();
	}

}
