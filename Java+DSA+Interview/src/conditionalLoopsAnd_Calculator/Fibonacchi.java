package conditionalLoopsAnd_Calculator;

public class Fibonacchi {

	public static void main(String[] args) {
		// TODO Auto-
		
		
		int n=7;
		
		
		int a=0;
		int b=1;
		
		
		int count=2;
		
		
		while(count<=n) {
			int temp = b;
			b=b+a;
			a=temp;
			count++;
		}
		
		System.out.println(b);
	}

}
