package conditionalLoopsAnd_Calculator;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().trim().charAt(0);
		
		if(ch<='z' && ch>='a') {
			System.out.println("Small");
		}else {
			System.out.println("Big");
		}
	}

}
