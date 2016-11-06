
public class Solution {
	public static void main(String[] args) {
		binRep(0.75011111111);
		binRep(1.2);
		binRep(0.5);
		binRep(0.2);
		System.out.println(oneAway("andres", "anpres"));
		System.out.println(oneAway("endrec", "andres"));
		System.out.println(oneAway("Andres", "ndres"));
		System.out.println(oneAway("ndrss", "Andres"));
		System.out.println(oneAway("Anres", "Andres"));
		System.out.println(oneAway("Andres", ""));
		System.out.println(oneAway("", "Andres"));
		

	}

	static boolean oneAway(String s1, String s2) {
		if (s1.equals(s2))
			return true;
		if (Math.abs(s1.length() - s2.length()) > 1)
			return false;

		boolean changeMade = false;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					if (changeMade)
						return false;
					else
						changeMade = true;
				}
			}
			return true;
		}

		String shorter, longer;
		if (s1.length() < s2.length()) {
			shorter = s1;
			longer = s2;
		} else {
			shorter = s2;
			longer = s1;
		}
		System.out.println(shorter + longer);
		int i = 0;
		int j = 0;
		while (j < longer.length()) {
			if (shorter.charAt(i) == longer.charAt(j)) {
				i++;
				j++;
			} else {
				if (changeMade)
					return false;
				else {
					j++;
					changeMade = true;
				}
			}
		}
		return true;
	}

	public static void binRep(double d) {

		if (d <= 0 || d >= 1) {
			System.out.println("Error: double must be between 0 and 1");
			return;
		}
		// Convert d to integer by shifting.
		String result = "";
		String s = Double.toString(d);
		int numDecimals = s.length() - s.indexOf('.') - 1;
		for (int i = 0; i < numDecimals; i++) {
			d *= 10;
		}
		int i = (int) d;

		int count = 0;
		while (i > 0) {
			if (count >= 32) {
				System.out.println("ERROR: Number too large to represent in 32 bits");
				return;
			}
			if ((i & 1) == 1)
				result = '1' + result;
			else
				result = '0' + result;
			i >>= 1;
			count++;
		}
		System.out.println(result);
	}
}
