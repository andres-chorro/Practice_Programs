
public class OneAway {
	public static void main(String[] args) {
		String s1, s2;
		s1 = "pale";
		s2 = "ple";
		System.out.println("Expecting true: " + isOneAway(s1, s2));
		s1 = "pales";
		s2 = "ales";
		System.out.println("Expecting true: " + isOneAway(s1, s2));
		s1 = "pale";
		s2 = "bale";
		System.out.println("Expecting true: " + isOneAway(s1, s2));
		s1 = "pal";
		s2 = "bale";
		System.out.println("Expecting false: " + isOneAway(s1, s2));
		s1 = "bale";
		s2 = "bale";
		System.out.println("Expecting false: " + isOneAway(s1, s2));
		s1 = "pale";
		s2 = "bake";
		System.out.println("Expecting false: " + isOneAway(s1, s2));
	}

	public static boolean isOneAway(String s1, String s2) {
		if (s1 == s2)
			return false;
		int lengthDiff = s1.length() - s2.length();
		if (lengthDiff > 1 || lengthDiff < -1)
			return false;
		if (lengthDiff == 0) {
			boolean foundDiff = false;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					if (foundDiff)
						return false;
					else
						foundDiff = true;
				}
			}
		} else {
			if (lengthDiff < 0) { // ensure s1 is 1 char longer than s2
				String tmp = s2;
				s2 = s1;
				s1 = tmp;
			}
			int i = 0;
			while (i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
				i++;
			}
			int j = i++;
			while (i < s1.length()) {
				if (s1.charAt(i) != s2.charAt(j))
					return false;
				i++;
				j++;
			}
		}
		return true;
	}
}
