package SinglyLinkedList;

import java.util.LinkedList;

//Head is instance variable
//create a node - ListNode head = new ListNode(<value>);
//create additional nodes - ListNode second = new ListNode(<value>);
//setting links between head and second - head.next = second;
public class CreatingSinglyLinkedList {
public static void main(String[] args) {
	MyLinkedList list = new MyLinkedList();
	
	list.insertStart(3);
	list.insert(4);
	list.insertStart(5);
	list.insert(10);
	list.insertAt(0, 99);
	list.show();
	
}
	
	
	 
}
