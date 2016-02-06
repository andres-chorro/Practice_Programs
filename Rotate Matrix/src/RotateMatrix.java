
public class RotateMatrix {
	public static void main(String[] args) {
		printArray(generateScreen(3));
		printArray(rotate(generateScreen(3)));
		printArray(generateScreen(4));
		printArray(generateScreen(5));
		printArray(generateScreen(0));

	}
	
	public static int[][] rotate(int[][] matrix) {
		if (matrix.length != matrix[0].length)
			return null;
		int x, y, nextx, nexty, min, tmp;
		x = y = nextx = nexty = min = tmp = 0;
		int max = matrix.length - 1;
		while (min < max) {
			for (int i = min; i <= max; i++) {
				int top = matrix[i][min];
				matrix[i][min] = matrix[min][max-(i-min)];//left to top
				matrix[min][max-(i-min)] = matrix[max-(i-min)][max];//bottom to left
				matrix[max-(i-min)][max] = matrix[max][i];//right to bottom
				matrix[max][i] = top;
			}
			min++;
			max--;
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
