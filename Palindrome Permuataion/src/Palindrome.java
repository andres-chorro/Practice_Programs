
public class Palindrome {

	public static void main(String[] args) {
		String test1 = "";
		String test2 = "Hello llHe";
		String test3 = "  Helllhl";
		String test4 = "this should fail";
		System.out.println("Expected true: " + palindromePerm(test1));
		System.out.println("Expected true: " + palindromePerm(test2));
		System.out.println("Expected true: " + palindromePerm(test3));
		System.out.println("Expected false: " + palindromePerm(test4));
	}

	public static boolean palindromePerm(String input) {
		boolean[] oddCount = new boolean[26];
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isLetter(c)) {
				c = (char) (Character.toLowerCase(c) - 'a');
				oddCount[c] = !oddCount[c];
			}
		}
		boolean oneOdd = false;
		for (int i = 0; i < oddCount.length; i++) {
			if (oddCount[i]) {
				if (oneOdd)
					return false;
				else
					oneOdd = true;
			}
		}
		return true;
	}
}
