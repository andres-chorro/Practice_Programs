
public class StringCompression {
	public static void main(String[] args) {
		String test1 = "hello";
		String test2 = "wwwhaaaatiiiisuuup";
		String test3 = "thisshouldnotcompres";
		String test4 = "";
		String test5 = "aaaaaaaaaaaaaa";
		System.out.println(compress(test1));
		System.out.println(compress(test2));
		System.out.println(compress(test3));
		System.out.println(compress(test4));
		System.out.println(compress(test5));
	}
	
	public static String compress(String in) {
		String result = "";
		int repeats = 1;
		for (int i = 0; i < in.length(); i++) {
			if (i < in.length() - 1 && in.charAt(i) == in.charAt(i + 1))
				repeats++;
			else {
				result += repeats + in.substring(i, i+1);
				repeats = 1;
			}
		}
		return (result.length() < in.length()) ? result : in;
		
	}
}
