import java.util.*;

public class Solution {
	public static void main(String[] args) {
		
	}
}

class Stack<T extends Comparable> {
	private static class StackNode<T> {
		private T data;
		private StackNode<T> next;
		private T minSoFar;
		
		public StackNode<T>(T data) {
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	
	public T pop() {
		if (top == null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item) {
		StackNode newHead = new StackNode(item);
		if (top == null || item < top.minSoFar)
			newHead.minSoFar = item;
		else
			newHead.minSoFar = top.minSoFar; 
		newHead.next = top;
		top = newHead;
		
	}
	
	public T peek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public T min() {
		if (top == null) throw new EmptyStackException();
		return top.minSoFar;
}