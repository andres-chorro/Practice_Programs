
public class Palindrome {
	public static void main(String[] args) {
		Node number1 = new Node(1);
		number1.appendToTail(4);
		number1.appendToTail(8);
		number1.appendToTail(4);
		number1.appendToTail(1);
		if (isPalindrome(number1))
			System.out.println("Success");
		else
			System.out.println("fail");
		number1.appendToTail(3);
		if (isPalindrome(number1))
			System.out.println("fail");
		else
			System.out.println("Success");
	}
	
	private static boolean isPalindrome(Node list) {
		Node backwards = new Node(0);
		Node temp = list;
		while (temp != null) {
			Node newHead = new Node(temp.data);
			newHead.next = backwards;
			backwards = newHead;
			temp = temp.next;
		}
		temp = list;
		while (temp != null && backwards != null) {
			if (temp.data != backwards.data)
				return false;
			temp = temp.next;
			backwards = backwards.next;
		}
		return true;
	}
}
