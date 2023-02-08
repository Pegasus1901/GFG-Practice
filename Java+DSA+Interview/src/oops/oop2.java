package oops;
// pakages
/*
 *static variable is common to all but related to none
 *static variables are not dependent on any object
 *static belong to class not object
 * 
 * why main static
 * to run main without creating its object
 */

class Newer{
	
}

public class oop2 {
	static class A{
		 
		
		
	}
	public static void main(String[] args) {
		Human ps= new Human(10, 19, 10);
		Human sr= new Human(5, 5, 5);
		
		//dont use like this
		//System.out.println(ps.population);
		//System.out.println(sr.population);
		
		//use like this
		System.out.println(Human.population);
	}

}
 