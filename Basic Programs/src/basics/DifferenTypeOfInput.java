package basics;

import java.io.*;

public class DifferenTypeOfInput {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
		String name=reader.readLine();
		
		System.out.println("Entered Data Is- "+ name);
	}

}
