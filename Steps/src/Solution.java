
public class Solution {
	public static void main(String[] args) {
		System.out.println(steps(4));
		System.out.println(steps(5));
		System.out.println(steps(6));
		System.out.println(steps(36));
		System.out.println(steps(37)); // OVERFLOW
		System.out.println(steps(38));
		System.out.println(steps(50));
		
		System.out.println(compress("hello"));
		System.out.println(compress("heeeelllooo"));
		System.out.println(compress(""));
		System.out.println(compress("1333342nndsike"));
		
		System.out.println(conversion(29, 15));
		
		System.out.println(pairwiseSwap(2));
		System.out.println(pairwiseSwap(1));
		System.out.println(pairwiseSwap(10));
	}
	
	static int steps(int n) {
		return steps(n, new int[n + 1]);
	}
	
	static int steps(int n, int[] memo) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;
		if (memo[n] == 0)
			memo[n] = steps(n-1, memo) + steps(n-2, memo) + steps(n-3, memo);
		return memo[n];
	}
	
	public static String compress(String s) {
		StringBuilder result = new StringBuilder();
		int i = 0;
		while(i < s.length()) {
			char curr = s.charAt(i);
			int count = 0;
			while (i < s.length() && s.charAt(i) == curr) {
				count++;
				i++;
			}
			result.append(curr);
			result.append(count);
		}
		
		if (result.length() > s.length())
			return s;
		else
			return result.toString();
	}
	
	public static int conversion(int a, int b) {
		int result = 0;
		while (a != 0 || b != 0) {
			if ((a & 1) != (b & 1))
				result++;
			a >>>= 1;
			b >>>= 1;
		}
		return result;
	}
	
	public static int pairwiseSwap(int a) {
		return ((a & 0xaaaaaaaa) >>> 1) | ((a & 0x55555555) << 1);
		
	}
}
