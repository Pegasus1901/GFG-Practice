package oops;

public class Human {
	int age;
	int name;
	int salary;
	static int population;
	public Human(int age, int name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		Human.population +=1;
	}

	

}
