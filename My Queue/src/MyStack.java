
public class MyStack {
	private int stack[];
	private int size;
	
	public MyStack(int capacity) {
		stack = new int[capacity];
		size = 0;
	}
	
	public void push(int value) {
		stack[size] = value;
		size++;
	}
	
	public int pop() {
		int tmp = stack[size-1];
		size--;
		return tmp;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder("[ ");
		for (int i = 0; i < size; i++) {
			s.append(stack[i] + " ");
		}
		s.append("]");
		return s.toString();
	}
}
