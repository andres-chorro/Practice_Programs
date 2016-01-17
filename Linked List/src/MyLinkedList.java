
public class MyLinkedList {
	private Node root;
	public MyLinkedList(int rootValue){
		root = new Node(rootValue);
	}
	
	/*
	 * Add int value to the end of the list
	 */
	public void add(int value){
		Node curr = root;
		while (curr.getNext() != null) {
			curr = curr.getNext();
		}
		curr.setNext(new Node(value));
	}
	
	/**
	 * get the item stored at index
	 * @param index the index of the desired object
	 * @return the value of the node at index. -1 if index is greater than (size-1)
	 */
	
	public int get(int index) {
		if (index < 0)
			return -1;
		Node curr = root;
		while (true){
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
