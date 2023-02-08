package basics;

public class AdditionOfComplexNumbers {
	
	int original,imagine;

	public AdditionOfComplexNumbers(int r, int i) {
		this.original=r;
		this.imagine=i;
	}
	public void showC()
    {
        System.out.print(this.original + " +i" + this.imagine);
    }
	public static AdditionOfComplexNumbers addition(AdditionOfComplexNumbers n1, AdditionOfComplexNumbers n2) {
		
		AdditionOfComplexNumbers res = new AdditionOfComplexNumbers(0, 0);
		res.original= n1.original + n2.original;
		res.imagine= n1.imagine+n2.imagine;
		
		return res; 
		
	}
	public static void main(String[] args) {
		AdditionOfComplexNumbers a = new AdditionOfComplexNumbers(4, 5);
		AdditionOfComplexNumbers b = new AdditionOfComplexNumbers(10, 12);
		
		AdditionOfComplexNumbers res= addition(a, b);
		res.showC();
	}

}
