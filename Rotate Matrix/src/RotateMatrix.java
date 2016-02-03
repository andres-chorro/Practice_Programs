
public class RotateMatrix {
	public static void main(String[] args) {
		int[][] test = {{3,3},{3,3}};
		printArray(rotate(test));
	}
	
	public static int[][] rotate(int[][] matrix) {
		if (matrix.length != matrix[0].length)
			return null;
		int x, y, min, tmp = 0;
		int max = matrix.length - 1;
		while (min < max) {
			for (int i = min; i <= max; i++) {
				for (int j = 0; j < 4; j++) {
					tmp = matrix[max-y][x];
					matrix[max-y][x] = matrix[x][y];
					x = max - y;
					y = x;
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
}
