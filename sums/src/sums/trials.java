package sums;

public class trials {
	static int count=0;
	static int function(int a, int b) {
		
		count++;
		if(a<b) {
			return function(b,a);
		}else if((b!=0)) {
			return (a+ function(a,b-1));
		}else {
			return 0;
		}
	}

public static void main(String[] args) {
		function(8,9);
		System.out.println(count);
	}
	

}
