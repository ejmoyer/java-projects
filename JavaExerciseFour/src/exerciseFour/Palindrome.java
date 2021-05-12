package exerciseFour;
import java.lang.StringBuilder;

public class Palindrome {
	
	StringBuilder checker = new StringBuilder();
	
	public void checkPalindrome(String input) {
		checker.append(input);
		checker.reverse();
		String testStr = new String(checker);
		if (testStr.equals(input)) {
			System.out.println("Your input was a palindrome!");
		} else {
			System.out.println("Your input was not a palindrome!");
		}
	}
}
