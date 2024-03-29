package classesAndObjects;

public class ObjectCreation {

//String name;
//int age;
//int no;
//
//public ObjectCreation(String name, int age,int number) {
//	this.name=name;
//	this.age=age;
//	this.no=number;
//}
//public String getName() {
//	return name;
//}
//public int getAge() {
//	return age;
//}
//public int getNo() {
//	return no;
//}
//
//@Override
//public String toString() {
//	return "ObjectCreation [name=" + name + ", age=" + age + ", no=" + no + "]";
//}
//}

// Class Declaration

	// Instance Variables
	String name;
	String breed;
	int age;
	String color;

	// Constructor Declaration of Class
	public ObjectCreation(String name, String breed,
				int age, String color)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	// method 1
	public String getName()
	{
		return name;
	}

	// method 2
	public String getBreed()
	{
		return breed;
	}

	// method 3
	public int getAge()
	{
		return age;
	}

	// method 4
	public String getColor()
	{
		return color;
	}

	@Override
	public String toString()
	{
		return("Hi my name is "+ this.getName()+
			".\nMy breed,age and color are " +
			this.getBreed()+"," + this.getAge()+
			","+ this.getColor());
	}

	public static void main(String[] args)
	{
		ObjectCreation tuffy = new ObjectCreation("tuffy","papillon", 5, "white");
		System.out.println(tuffy.toString());
	}
}
