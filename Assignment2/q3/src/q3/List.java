package q3;

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
		head=null;
	}
	
	public void addFirst(int d) {
		Node nnode = new Node(d);
		nnode.next = head.next;
		head=nnode;
	}
	public int deleteFirst() {
		if(head==null) {
			return -1;
		}
		else {
			int temp = head.data;
			head = head.next;
			return temp;
		}
	}
	public int getFirst() {
		if(head==null) {
			return -1;
		}
		else {
			return head.data;
		}
	}
	public void addLast(int d) {
		Node nnode = new Node(d);
		if(head==null) {
			head = nnode;
			return;
		}
		else {
			Node trav = head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next = nnode;
		}
	}
	public int deleteLast() {
		if(head==null) {
			return -1;
		}
		else {
			Node trav = head;
			while(trav.next.next!=null) {
				trav=trav.next;
			}
			int temp = trav.next.data;
			trav.next=null;
			return temp;
		}
	}
	
	public int getLast() {
		if(head==null) {
			return -1;
		}
		else {
			Node trav = head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			return trav.data;
		}
	}
	
	public void display() {
		System.out.print(" ==>");
		Node trav = head;
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}
		System.out.print("");
	}
}
