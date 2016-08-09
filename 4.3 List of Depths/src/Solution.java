import java.util.*;

public class Solution {
	public static void main(String[] args) {
		TreeNode input1 = new TreeNode(5);
		input1.rightChild = new TreeNode(7);
		input1.leftChild = new TreeNode(4);
		input1.leftChild.leftChild = new TreeNode(3);
		//System.out.println(input1);
		System.out.println(getDepths(input1));
		
	}
	
	public static ArrayList<LinkedList<Integer>> getDepths(TreeNode n){
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		helper(n, result, 0);
		return result;
	}
	private static void helper(TreeNode node, ArrayList<LinkedList<Integer>> list, int depth) {
		if (node == null)
			return;
		if (depth > list.size() - 1)
			list.add(new LinkedList<Integer>());
		list.get(depth).add(node.data);
		helper(node.leftChild, list, depth + 1);
		helper(node.rightChild, list, depth + 1);
		
		
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
