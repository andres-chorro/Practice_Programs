import java.util.*;

public class MinimalHeight {
	public static void main(String[] args) {
		int[] input1 = {1, 3, 5, 7, 9, 10, 26};
		System.out.println(minimalTree(input1, 0, input1.length-1));
	}
	
	public static TreeNode minimalTree(int[] input, int start, int end) {
		if (input.length == 0)
			return null;
		if (start == end) {
			return new TreeNode(input[start]);
		}
		if (end - start == 1) {
			TreeNode n = new TreeNode(input[end]);
			n.leftChild = new TreeNode(input[start]);
			return n;
		}
		
		int middle = (start + end) / 2;
		TreeNode node = new TreeNode(input[middle]);
		node.leftChild = minimalTree(input, start, middle - 1);
		node.rightChild = minimalTree(input, middle + 1, end);
		return node;
		
	}
	
	static class TreeNode {
		public int data;
		public TreeNode leftChild;
		public TreeNode rightChild;
		
		public TreeNode(int data) {
			this.data = data;
			this.leftChild = null;
			this.rightChild = null;
		}
		
		@Override
		public String toString() {
			if (leftChild == null && rightChild == null) {
				return Integer.toString(data);
			}
			String s = Integer.toString(data) + "\n";
			s += "left child (" + leftChild.toString() + ")";
			s += "right Child (" + rightChild.toString() + ")";
			return s;
		}
	}
}
