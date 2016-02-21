public class SumLists {
	public static void main(String[] args) {
		Node list = new Node(1);
		for (int i = 0; i < 10; i++){
			list.appendToTail(i);
		}
		Node tmp = list;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	
	/**
	 * takes in two nodes that represent numbers. Head is the ones place.
	 * @param n1
	 * @param n2
	 * @return
	 */
	private Node sumLists(Node n1, Node n2) {
		
	}

}
