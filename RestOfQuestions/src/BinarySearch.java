
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1, 5, 6, 10, 12, 34, 50, 100};
		System.out.println(binSearch(arr, -100));
		System.out.println(binSearch(arr, 100));
	}
	public static int binSearch(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] < x) {
				low = mid + 1;
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
