import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int i = 5;
		int j = i;
		j = 15;
		System.out.println(i);
		System.out.println(j);
		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(6100);
		list.add(63);
		list.add(1);
		System.out.println(stackSort(list));
		LinkedList<String> slist = new LinkedList<String>();
		slist.add("Hello");
		slist.add("My");
		slist.add("Name");
		slist.add("Is");
		slist.add("Andres");
		slist.add("How");
		System.out.println(stackSort(slist));
		
		
	}
	
	private static <T extends Comparable<T>> LinkedList<T> stackSort(LinkedList<T> list) {
		LinkedList<T> storage = new LinkedList<T>();
		//first, sort storage in ascending order
		while(!list.isEmpty()) {
			T temp = list.pop();
			if (storage.isEmpty())
				storage.push(temp);
			else {
				int counter = 0;
				// Get to the correct position on storage
				while (!storage.isEmpty() && temp.compareTo(storage.peek()) < 0){
					list.push(storage.pop());
					counter++;
				}
				storage.push(temp);
				// return the larger elements to storage
				for (int i = 0; i < counter; i++) {
					storage.push(list.pop());
				}
			}
		}
		while (!storage.isEmpty())
			list.push(storage.pop());
		return list;
		
	}
}
