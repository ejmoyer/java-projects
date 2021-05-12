package exerciseFour;

public class ReplaceSubstring {
	
	public void replaceSubstring(String originalStr, String subToReplace, String replaceWith) {
		String newString = new String(originalStr);
		System.out.println(newString.replaceAll(subToReplace, replaceWith));
	}
}
