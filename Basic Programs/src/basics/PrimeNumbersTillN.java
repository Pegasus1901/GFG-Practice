package basics;

public class PrimeNumbersTillN {
	
	static void prime(int N) {
		int x, y, flg;
		
		for(x=1;x<N;x++) {
			if(x==1 || x==0) {
				continue;
			}
			flg=1;
			for(y=2;y<=x/2;++y) {
				 if (x % y == 0) {
	                    flg = 0;
	                    break;
	                }
			}
			if (flg == 1) {
                System.out.println(x + " ");
        	}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 45;
		prime(N);

	}

}
