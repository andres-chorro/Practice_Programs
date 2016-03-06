
public class MyQueue {
	private MyStack stack;
	private MyStack queue;
	private int size;
	private boolean isQueue;
	private final int capacity;

	public static void main(String[] args) {
		MyQueue stack = new MyQueue(50);
		stack.enqueue(16);
		System.out.println(stack);
		stack.enqueue(2);
		System.out.println(stack);
		stack.enqueue(1);
		System.out.println(stack);
		stack.dequeue();
		System.out.println(stack);
		stack.enqueue(5);
		System.out.println(stack);
		stack.dequeue();
		System.out.println(stack);
		stack.dequeue();
		System.out.println(stack);
	}

	public MyQueue(int capacity) {
		stack = new MyStack(capacity);
		queue = new MyStack(capacity);
		size = 0;
		this.capacity = capacity;
		isQueue = false;
	}

	public void enqueue(int value) {
		if (size >= capacity)
			return;
		if (isQueue)
			toStack();
		stack[size] = value;
		size++;

	}

	public int dequeue() {
		if (size < 1)
			return -1;
		if (!isQueue)
			toQueue();
		int tmp = queue[size - 1];
		size--;
		return tmp;

	}

	private void toStack() {
		for (int i = 0; i < size; i++) {
			stack.push(queue.pop());
		}
		isQueue = false;
	}

	private void toQueue() {
		for (int i = 0; i < size; i++) {
			queue.push(stack.pop());
		}
		isQueue = true;
	}

	public String toString() {
		if (isQueue) {
			return queue.toString();
		} else {
			toQueue();
			return queue.toString();
		}

	}
}
