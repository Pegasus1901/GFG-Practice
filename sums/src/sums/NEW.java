package sums;

public class NEW {
	
	public static void main(String[] args) {
		num(false);
	}

	static void num(boolean n) {
		boolean a=n;
		boolean b=!a;
		boolean c=!b;
		
		if(!c==!a) {
			System.out.println("false");
			
		}else {
			System.out.println("true");
		}
		
	}
}
