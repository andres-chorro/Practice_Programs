
public class MinStack {
	private Node[] theStack;
	private int size;
	int min;

	public MinStack(int capacity) {
		theStack = new Node[capacity];
		size = 0;
		min = Integer.MAX_VALUE;
	}

	public void push(int value) {
		Node n;
		if (size == 0 || value < theStack[size-1].minBelow) {
			n = new Node(value, value);
			min = value;
		}
		else {
			n = new Node(value, theStack[size-1].minBelow);
		}
		theStack[size] = n;
		size++;
		
	}

	public int getMin() {
		return min;
	}

	public int pop() {
		int tmp = theStack[size - 1].value;
		size--;
		min = theStack[size-1].minBelow;
		return tmp;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[ ");
		for (int i = 0; i < size; i++) {
			s.append(theStack[i].value);
			s.append(" ");
		}
		s.append("]");
		return s.toString();
	}

	class Node {
		int value;
		int minBelow;

		Node(int value, int minBelow) {
			this.value = value;
			this.minBelow = minBelow;
		}
	}
}
