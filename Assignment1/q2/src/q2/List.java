package q2;


public class List {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	public List() {
		head = null;
	}
	public void add(int d) {
		Node newNode = new Node(d);
		if(head==null) {
			head = newNode;
		}
		
		else {
			Node temp = head;
//			System.out.println("-> "+temp.data);
			
			while(temp!=null) {
//				System.out.println("->-> "+temp.data);
				if(temp.data>d) {
//					System.out.println("inserting before:- ");
					insertBefore(temp.data, d);
					return;
				}
				else {
					if(temp.next==null) {
						temp.next=newNode;
						return;
					}
//					System.out.println("going to next");
					temp=temp.next;
				}
			}
//			System.out.println("Complete Traversal!");
		}
		
	}
	
	
	public void insertAfter(int afterThis,int newNodeData) {
		Node newNode = new Node(newNodeData);
		
		Node temp = head;
		while(temp!=null) {
			if(temp.data==afterThis)
				break;
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("The node Not in the list!!");
			return;
		}
		newNode.next=temp.next;
		temp.next = newNode;
		
	}
	public void insertBefore(int beforeThis,int newNodeData) {
		Node newNode = new Node(newNodeData);
		
		Node temp = head;
		if(temp.data==beforeThis) {
			newNode.next=temp;
			head = newNode;
			return;
		}
		while(temp.next!=null) {
			if(temp.next.data==beforeThis)
				break;
			temp=temp.next;
		}
		if(temp.next==null) {
			System.out.println("The node Not in the list!!");
			return;
		}
		newNode.next=temp.next;
		temp.next = newNode;
		
	}
	public void display() {
		Node temp = head;
		System.out.print("List -> ");
		while(temp!=null) {
			System.out.print(" "+ temp.data);
			temp=temp.next;
		}
		System.out.println("");
		System.out.println("");
	}
}
