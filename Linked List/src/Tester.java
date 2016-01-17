
public class Tester {
	public static void main(String[] args) {
		System.out.println("Starting List Tester:");
		
		MyLinkedList list = new MyLinkedList(1);
		list.add(3);
		list.add(100);
		System.out.println(list);
		System.out.println("The item in position 4 is: " + list.get(4));
	}
}
