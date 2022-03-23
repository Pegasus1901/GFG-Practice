package basics;
import java.util.*;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter Number To Find Factorial- ");
		int a= s.nextInt();
		
		int num=1,i;
		
		for(i=2; i<=a; i++) {
			if(a==0) {
				System.out.println("Factorial Of Number- "+1);
			}else {
				num*=i;
			}
		}
		System.out.println("Factorial Of Number- "+num);
	}

}
