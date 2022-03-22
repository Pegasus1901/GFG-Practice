package basics;
import java.util.*;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter First No- ");
		a= sc.nextInt();
		System.out.println("Enter Second No- ");
		b= sc.nextInt();
		System.out.println("Enter Third No- ");
		c= sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" Is the largest");
		}else if(b>c && b>a) {
			System.out.println(b+" Is the largest");
		}else {
			System.out.println(c+" Is the largest");
		}
	}

}
