package functionsAndMethods;

public class ReturnTypes {
	public static void main(String[]args) {
		sum();
		int x= sum2();
		System.out.println(x);
	}

	static void sum() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is"+sum);
	}
	static int sum2() {
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
	}

	

}
