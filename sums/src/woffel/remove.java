package woffel;

public class remove {

	static void removeChar(String input1, String input2)
	{
	    int j, count = 0, n = input1.length();
	    char []t = input1.toCharArray();
	    char c = input2.charAt(0);
	    for (int i = j = 0; i < n; i++)
	    {
	        if (t[i] != c)
	        t[j++] = t[i];
	        else
	            count++;
	    }
	     
	    while(count > 0)
	    {
	        t[j++] = '\0';
	        count--;
	    }
	     
	    System.out.println(t);
	}
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		removeChar(s, "g");
	}

}
