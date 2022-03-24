package basics;

import java.util.Scanner;

public class AddTwoBinaryStrings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		
		int alen= a.length();
		int blen= b.length();
		
		int i=0,carry=0;
		String result="";
		while(i<alen || i<blen || carry!=0) {
			int x=0;
			if(i<alen && a.charAt(alen-1-i)=='1') x=1;
			int y=0;
			if(i<blen && a.charAt(blen-1-i)=='1') y=1;
			
			result=(x+y+carry)%2+result;
			carry=(x+y+carry)/2;
			i++;
		}
		
		System.out.println(result);
	}

}
