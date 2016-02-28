
public class Tester {
	public static void main(String[] args) {
		MinStack stack = new MinStack(50);
		stack.push(16);
		System.out.println(stack);
		System.out.println(stack.getMin());
		stack.push(2);
		System.out.println(stack);
		System.out.println(stack.getMin());
		stack.push(1);
		System.out.println(stack);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.getMin());
		stack.push(5);
		System.out.println(stack);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.getMin());
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.getMin());
	}
}
