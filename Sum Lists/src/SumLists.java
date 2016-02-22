public class SumLists {
	public static void main(String[] args) {
		Node number1 = new Node(1);
		number1.appendToTail(4);
		number1.appendToTail(8);
		Node number2 = new Node(9);
		number2.appendToTail(2);
		number2.appendToTail(3);
		//Node result = sumLists(number1, number2);
		Node result = new Node(0);
		result = recursiveSum(result, number1, number2, 0);
		while (result != null) {
			System.out.print(result.data);
			result = result.next;
		}
		System.out.println();
		System.out.println("Expected: 1,170 (or 0 -> 7 -> 1 -> 1)");
	}

	/**
	 * takes in two nodes that represent numbers. Head is the ones place.
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static Node sumLists(Node number1, Node number2) {
		Node result = new Node(0);
		int carry = 0;
		while (number1 != null || number2 != null || carry != 0) {
			int n1 = 0;
			int n2 = 0;
			if (number1 != null) {
				n1 = number1.data;
				number1 = number1.next;
			}
			if (number2 != null) {
				n2 = number2.data;
				number2 = number2.next;
			}
			result.appendToTail((n1 + n2 + carry) % 10);
			carry = (n1 + n2 + carry) / 10;
		}
		result = result.next;
		return result;
	}

	private static Node recursiveSum(Node result, Node number1, Node number2, int carry) {
		if (number1 == null && number2 == null && carry == 0)
			return result;
		if (number1 == null && number2 == null) {
			result.appendToTail(carry);
			return result;
		}
		int n1 = 0;
		int n2 = 0;
		if (number1 != null) {
			n1 = number1.data;
			number1 = number1.next;
		}
		if (number2 != null) {
			n2 = number2.data;
			number2 = number2.next;
		}
		result.appendToTail((n1 + n2 + carry) % 10);
		carry = (n1 + n2 + carry) / 10;
		return recursiveSum(result, number1, number2, carry);

	}

}
