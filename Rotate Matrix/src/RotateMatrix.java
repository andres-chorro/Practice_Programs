
public class RotateMatrix {
	public static void main(String[] args) {
		int[][] test = {{3,3},{3,3}};
		//printArray(rotate(test));
		printArray(generateScreen(1));
		printArray(generateScreen(4));
		printArray(generateScreen(5));
		printArray(generateScreen(0));

	}
	
	public static int[][] rotate(int[][] matrix) {
		if (matrix.length != matrix[0].length)
			return null;
		int x, y, min, tmp;
		x = y = min = tmp = 0;
		int max = matrix.length - 1;
		while (min < max) {
			for (int i = min; i <= max; i++) {
				for (int j = 0; j < 4; j++) {
					
				}
			}
		}
		return matrix;
	}
	
	private static void printArray(int[][] matrix) {
		if (matrix == null){
			System.out.println("Null Matrix");
			return;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int[][] generateScreen(int length) {
		int counter = 0;
		int [][] result = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++){
				result[i][j] = counter;
				counter++;
			}
		}
		return result;
	}
}
