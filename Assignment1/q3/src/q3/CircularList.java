package q3;

public class CircularList {
	Node tail;
	class Node{
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	public CircularList() {
		tail = null;
	}
	public void addFirst(int d) {
		Node newNode = new Node(d);
		if(tail==null) {
			tail = newNode;
			newNode.next=newNode;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}
	public void addLast(int d) {
		Node newNode = new Node(d);
		if(tail==null) {
			tail = newNode;
			newNode.next=newNode;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display() {
		if(tail==null)return;
		Node temp = tail.next;
		System.out.println("\ntail: "+tail.data);
		System.out.print("List : ");
		while(temp!=tail){
			System.out.print(" "+temp.data);
			temp = temp.next;
		};
		System.out.print(" "+tail.data);
		
		System.out.println("");
	}
	
	
}
