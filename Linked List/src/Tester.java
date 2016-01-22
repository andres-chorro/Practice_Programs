import java.util.Scanner;

public class Tester {
	private static Scanner sc = new Scanner(System.in);
	private static String in = "";
	private static MyLinkedList list;

	public static void main(String[] args) {
		System.out.println("Starting List Tester:");
		System.out.println("Start with a pre-build list? (y/n)");
		if (sc.nextLine().equalsIgnoreCase("y")) {
			list = new MyLinkedList(1);
			list.add(3);
			list.add(100);
			System.out.println(list);
		} else {
			list = new MyLinkedList();
		}

		boolean done = false;
		while (!done) {
			System.out.println("The list is currently: " + list);
			System.out.println("Select an option [A]dd, [G]et, [P]op, [D]one");
			in = sc.nextLine();
			if (in.equalsIgnoreCase("a")) {
				addMenu();
			} else if (in.equalsIgnoreCase("g")) {
				// get
			} else if (in.equalsIgnoreCase("p")) {
				System.out.print(list.pop() + " has been removed.\n");
			} else if (in.equalsIgnoreCase("d")) {
				done = true;
			}
		}
		sc.close();
	}

	private static void addMenu() {
		System.out
				.println("Enter an integer Value to end to the end of the list:");
		int in = sc.nextInt();
		sc.nextLine(); // skip breakline after int
		list.add(in);
	}
}
