import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting List Tester:");
		System.out.println("Start with a pre-build list? (y/n)");
		if (sc.nextLine().equalsIgnoreCase("y")) {
			MyLinkedList list = new MyLinkedList(1);
			list.add(3);
			list.add(100);
			System.out.println(list);
		}
		boolean done = false;
		while (!done) {
			System.out.println("Select an option [A]dd, [G]et, [D]one");
			String in = sc.nextLine();
			if (in.equalsIgnoreCase("a")) {
				// add
			} else if (in.equalsIgnoreCase("g")) {
				// get
			} else if (in.equalsIgnoreCase("d")) {
				done = true;
			}
		}
		sc.close();
	}
}
