package arraysAndArrayList;

public class Scope {
	static int a=10; // Global Variable (Shadowing)

	public static void main(String[] args) {
//		fun(10,20,91);
		demo();
		System.out.println(a);

	}
	
	static void fun(int ...v) { //to take multiple no of arguments as parameter
		
		for(int i=0;i<v.length;i++) {
			System.out.println(v[i]);
		}
	}
	
	static void demo() {
		System.out.println(a); // global variable ref
		int a=20; //Shadow of global variable but value is changed only in the function, not outside the function
		System.out.println(a); //local variable ref
	}

		
}
