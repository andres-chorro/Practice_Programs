import java.util.*;

class SetOfStacks<T> {
	private LinkedList<LinkedList<T>> stackSet;
	private int stackCapacity;
	
	public SetOfStacks(int capacity) {
		stackSet = new LinkedList<LinkedList<T>>();
		stackSet.push(new LinkedList<T>());
		stackCapacity = capacity;
	}
	
	public void push(T object) {
		if (stackSet.peek().size() >= stackCapacity) {
			stackSet.push(new LinkedList<T>());
		}
		stackSet.peek().push(object);
	}
	
	public T pop() {
		if (stackSet.peek().isEmpty()) {
			if (stackSet.size() == 1)
				return null;
			stackSet.pop();
		}
		return stackSet.peek().pop();
		
	}
	
	@Override
	public String toString() {
		return stackSet.toString();
	}
	
	public static void main(String[] args) {
		SetOfStacks<Integer> stack = new SetOfStacks<>(5);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("The stack is currently: " + stack);
			System.out.println("Enter a number to push, q to quit, or pop to pop");
			if (sc.hasNextInt()) {
				stack.push(sc.nextInt());
			} else {
				String input = sc.next();
				if (input.equals("q"))
					break;
				if (input.equals("pop")) {
					System.out.println("You popped " + stack.pop());
				}
			}
		}
		sc.close();
		
	}
}