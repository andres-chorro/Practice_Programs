import java.util.*;

class Node {
	Node next;
	int data;
	
	Node(int d) {
		data = d;
	}
	
	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
}

public class ListPalendrome {
	
	public static void main(String[] args) {
		LinkedList<Integer> theList = new LinkedList<>();
		theList.add(5);
		theList.add(6);
		theList.add(17);
		theList.add(6);
		theList.add(5);
		System.out.println(isPalendrome(theList));
		LinkedList<Integer> theList2 = new LinkedList<>();
		theList2.add(5);
		theList2.add(6);
		theList2.add(17);
		theList2.add(7);
		theList2.add(5);
		System.out.println(isPalendrome(theList2));
		LinkedList<Integer> theList3 = new LinkedList<>();
		theList3.add(5);
		theList3.add(7);
		theList3.add(17);
		theList3.add(17);
		theList3.add(7);
		theList3.add(5);
		System.out.println(isPalendrome(theList3));
		Node first = new Node(1);
		first.appendToTail(5);
		first.appendToTail(6);
		first.appendToTail(5);
		first.appendToTail(1);
		System.out.println(isPalendromeSingle(first));
	}
	
	public static <T> boolean isPalendrome(LinkedList<T> theList) {
		ListIterator<T> forwards = theList.listIterator();
		ListIterator<T> backwards = theList.listIterator(theList.size());
		while (forwards.hasNext()) {
			if (!forwards.next().equals(backwards.previous()))
				return false;
		}
		return true;
	}
	
	public static boolean isPalendromeSingle(Node theList) {
		Node middle = theList;
		Node runner = theList;
		LinkedList<Integer> stack = new LinkedList<>();
		while (runner != null && runner.next != null) {
			stack.push(middle.data);
			middle = middle.next;
			runner = runner.next.next;
		}
		while (middle.next != null) {
			if (middle.data != stack.pop())
				return false;
		}
		return true;
	}
}
