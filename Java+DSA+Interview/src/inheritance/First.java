package inheritance;

public class First {

	int age;
	int year;
	First(){
		this.age=1;
		this.year=1;
	}
	
	First(int age) {
		this.age = age;
	}
	
	First (int age,int year){
		this.age=age;
		this.year=year;
	}
	First(First news){
		this.age=news.age;
		this.year=news.year;
	}

}
