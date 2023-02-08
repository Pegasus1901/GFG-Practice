package inheritance;

public class Main {

	public static void main(String[] args) {
		//First box =new First(10,19);
		//First box2= new First(12);
		//First box1 = new First(box);
		//System.out.println(box1.age + " " + box1.year);
		
		Second box3= new Second();
		System.out.println(box3.age+" "+box3.weight);
		
		First box4= new Second();
		System.out.println(box4.age+ " " /*box4.weight---can't access child members*/);
	}

}
