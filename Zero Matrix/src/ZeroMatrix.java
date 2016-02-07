
public class ZeroMatrix {

	public static void main(String[] args) {
		int matrix[][] = generateScreen(3);
		matrix[0][2] = 0;
		System.out.println("Before Zeros:");
		printArray(matrix);
		zeroMatrix(matrix);
		System.out.println("After Zeros:");
		printArray(matrix);
	}

	private static void zeroMatrix(int matrix[][]) {
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		boolean rows[] = new boolean[numRows];
		boolean columns[] = new boolean[numCols];
		
		for (int i = 0; i < numRows; i++)
		{
			for (int j = 0; j < numCols; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					columns[j] = true;
				}		
			}
		}
		for (int i = 0; i < numRows; i++){
			if (rows[i]) {
				for (int j = 0; j < numCols; j++)
					matrix[i][j] = 0;
			}		
		}
		for (int i = 0; i < numCols; i++) {
			if (columns[i]){
				for (int j = 0; j < numRows; j++){
					matrix[j][i] = 0;
				}
			}
		}
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
