
public class Solution {

	public static int maxStreak(int input) {
		int result = 0;
		int currentStreak = 0;
		int previousStreak = 0;
		int oneBack = 0;

		while (input < 0){
			int curr = (input & 1);
			
			//reset
			if (curr == 0 && oneBack == 0) {
				currentStreak = 0;
				previousStreak = 0;
			} else if (curr == 0 && oneBack == 1) {
				previousStreak = currentStreak;
			} else
				currentStreak++;
			if (currentStreak + previousStreak > result)
				result = currentStreak + previousStreak;
			input >>= 1;
			oneBack = curr;
		}
		return result;
	}
}
