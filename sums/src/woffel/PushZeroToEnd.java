package woffel;

public class PushZeroToEnd {
	static void pushZerosToEnd(int[] input1, int input2)
    {
        int count = 0;  
        
        for (int i = 0; i < input2; i++)
            if (input1[i] != 0)
                input1[count++] = input1[i]; 
        
        while (count < input2)
            input1[count++] = 0;
        
        for (int i=0; i<input2; i++)
            System.out.print(input1[i]+" ");
    }
	

}
