
public class Node {
	private Node next;
	private int data;
	public Node(int data) {
		next = null;
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public String toString() {
		return Integer.toString(data);
	}
}
