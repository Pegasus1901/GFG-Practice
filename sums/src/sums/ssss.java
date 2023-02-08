package sums;

public class ssss {

	public static void main(String[] args) {
		fun(10);
	}

	public static int fun(int num) {
		if(num==0) {
			return 0;
		}
		fun(num-1);
		System.out.println(num);
		return num;
	}
}
