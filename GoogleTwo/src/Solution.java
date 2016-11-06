import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		String[] in = {"hello", "hello", "dog", "dog", "andres"};
		System.out.println(shortestDistance("andres", "hello", in));
	}

	public static int shortestDistance(String a, String b, String[] arr) {

		boolean seenA = false;
		boolean seenB = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(a) && arr[i].equals(b))
				return 0;
			else if (arr[i].equals(b))
				seenB = true;
			else if (arr[i].equals(a))
				seenA = true;
		}
		if (!seenA || !seenB)
			return -1;

		TreeSet<Integer> aOccurences = new TreeSet<>();
		TreeSet<Integer> bOccurences = new TreeSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(a))
				aOccurences.add(i);
			else if (arr[i].equals(b))
				bOccurences.add(i);
		}
		int currentMin = Integer.MAX_VALUE;
		for (int i : aOccurences) {
			Integer higher = bOccurences.ceiling(i);
			Integer lower = bOccurences.floor(i);
			Integer closest = Integer.MAX_VALUE;
			if (higher == null)
				closest = lower;
			else if (lower == null)
				closest = higher;
			else
				closest = Math.min(Math.abs(i - higher), Math.abs(i - lower));
			currentMin = Math.min(Math.abs(i - closest), currentMin);
		}

		return currentMin;
	}
}
