package singlyLinkedListPractice;

public class Mainn {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		list.insertLast(10);
		list.insertFirst(4);
		list.insert(6);
		list.show();
		System.out.println("list size is :"+list.size);
	}
}
