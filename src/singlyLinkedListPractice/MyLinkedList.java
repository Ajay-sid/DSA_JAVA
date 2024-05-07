package singlyLinkedListPractice;

public class MyLinkedList {

	
	Node head;
	Node tail;
	int size;
	public MyLinkedList() {
		size=0;
	}
	
	public void insertFirst(int data) {
		if(head==null) {
			insert(data);
		}else {
		Node node = new Node();
		node.data=data;
		node.next=head;
		head=node;
		size++;
		}
		
	}
	
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		
		if(head==null) {
			head=node;
			tail=head;
		}else {
			Node n=tail;
			n.next=node;
			tail=node;
		}
		size++;
		
		
	}
	
	
	
	public void show() {
		Node n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
		
	}
	
	
	
	
	
	
}
