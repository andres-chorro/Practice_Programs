public class URLStrings {
	public static void main(String[] args) {
		char[] test1 = new char[30];
		char[] s = "hello this has spaces.".toCharArray();
		for (int i = 0; i < s.length; i++) {
			test1[i] = s[i];
		}
		urlString2(test1, 22);
		System.out.println(test1);
	}

	/**
	 * Converts all spaces in array to %20.  Slow: O(N^2)
	 * 
	 * @param array
	 * @param size
	 * @return
	 */
	public static void urlString(char[] array, int trueSize) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				for (int j = array.length - 3; j > i; j--)
					array[j + 2] = array[j];
				array[i] = '%';
				array[i + 1] = '2';
				array[i + 2] = '0';
			}
		}
	}

	/**
	 * This is faster O(N)
	 * @param array
	 * @param size
	 */
	public static void urlString2(char[] array, int size) {
		int spaceCount = 0;
		for (int i = 0; i < size; i++) {
			if (array[i] == ' ')
				spaceCount++;
		}
		int newLength = size + spaceCount * 2;
		for (int i = size - 1; i >= 0; i--) {
			if (array[i] == ' ') {
				array[newLength - 1] = '0';
				array[newLength - 2] = '2';
				array[newLength - 3] = '%';
				newLength -= 3;
			} else {
				array[newLength - 1] = array[i];
				newLength--;	
			}
		}
	}
}
