package basics;

public class CheckCharacterIsVowelOrConsonent {
	
	static void isVowel(char s) {
		if(s=='a' || s=='e'|| s=='i' || s=='o' || s=='u') {
			System.out.println("It is a vowel");
		}else {
			System.out.println("Not a vowel, It is consonent");
		}
	}

	public static void main(String[] args) {
		isVowel('a');
		isVowel('b');
	}

}
