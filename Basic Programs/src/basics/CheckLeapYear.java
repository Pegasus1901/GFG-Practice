package basics;

public class CheckLeapYear {
	
	public static void leapYear(int y) {
		boolean isLeapYear=false;
		
		if(y%4==0 && y%100==0) {
			if(y%400==0) {
				isLeapYear=true;
			}else {
				isLeapYear=false;
			}
		}
		else {
			isLeapYear=false;
		}
		
		if (!isLeapYear)
			System.out.println(y + " : Non Leap-year");
	    else
	        System.out.println(y + " : Leap-year");
	}

	public static void main(String[] args) {
		leapYear(2000);
		leapYear(2002);
		leapYear(2022);
	}

}
