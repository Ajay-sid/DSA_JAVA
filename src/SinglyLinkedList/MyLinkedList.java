package SinglyLinkedList;

public class MyLinkedList {

	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
		
	}
	
	public void show() {
		Node n = head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
		
		
		
	}
	public void insertStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;

	}
	
	public void insertAt(int position,int data) {
		
		
		Node node = new Node();
		node.data=data;
		Node n=head;
		if(position==0) {
			node.next=n;
			head=node;
		}else{
		for(int i=0;i<position-1;i++) {
		n=n.next;	
		}
		node.next=n.next;
		n.next=node;
		
		}
		
		
		
		
	}
	
	
}
