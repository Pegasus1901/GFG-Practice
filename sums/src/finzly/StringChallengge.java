package finzly;

public class StringChallengge {
	
	public static void StringChallenge(String str1) {
		
		StringBuffer newStr=new StringBuffer(str1);  
		
		for(int i = 0; i < str1.length(); i++) {    
			
            if(Character.isLowerCase(str1.charAt(i))) {    
                   
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
               
            else if(Character.isUpperCase(str1.charAt(i))) {    
                
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }
		for(int j=0; j<newStr.length();j++) {
			String nstr = " ";
			char ch;
			if(!Character.isDigit(newStr.charAt(j)) && Character.isWhitespace(newStr.charAt(j)) ) {
				for (; j<str1.length(); j++)
			      {
			        ch= newStr.charAt(j);
			        nstr= ch+nstr;
			        
			      }
				System.out.println(nstr);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		StringChallenge("Hello World");

	}

}
