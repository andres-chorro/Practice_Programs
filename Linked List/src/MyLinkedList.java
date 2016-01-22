public class MyLinkedList {
	private Node root;

	/**
	 * Start a list with a null root.
	 */
	public MyLinkedList() {
		root = null;
	}

	/**
	 * Start a list with rootValue as the first item.
	 * 
	 * @param rootValue
	 */
	public MyLinkedList(int rootValue) {
		root = new Node(rootValue);
	}

	/**
	 * Add a value to the end of the list.
	 * 
	 * @param value
	 */
	public void add(int value) {
		if (root == null) {
			root = new Node(value);
			return;
		}
		Node curr = root;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(new Node(value));
	}

	/**
	 * Remove and return the element at the head of the list.
	 */
	public int pop() {
		Node tmp = root;
		if (root != null) {
			root = root.getNext();
		}
		return tmp.getData();	
	}

	/**
	 * get the item stored at index
	 * 
	 * @param index
	 *            the index of the desired object
	 * @return the value of the node at index. -1 if index is greater than
	 *         (size-1)
	 */

	public int get(int index) {
		if (index < 0)
			return -1;
		Node curr = root;
		while (true) {
			if (curr == null)
				return -1;
			if (index == 0)
				return curr.getData();
			curr = curr.getNext();
			index--;
		}
	}

	public String toString() {
		String s = "";
		Node curr = root;
		while (curr != null) {
			s = s.concat(curr.toString());
			if (curr.getNext() != null)
				s = s.concat(", ");
			curr = curr.getNext();
		}
		return s;
	}
}
