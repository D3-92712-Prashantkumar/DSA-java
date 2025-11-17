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
	public void addAtPosition(int pos,int data) {
		Node newNode = new Node(data);
		Node temp = tail.next;
		int count = 1;
		do{
			if(count+1==pos) {
				newNode.next = temp.next;
				temp.next = newNode;
				return;
			}
			System.out.print(" "+temp.data);
			temp = temp.next;
			count++;
		}while(temp!=tail.next);
		if(temp==tail.next) {
			System.out.println("Position Out Of Range!!\nAdding Node at the End");
			addLast(data);
		}
	}
	public void display() {
		if(tail==null)return;
		Node temp = tail.next;
		System.out.println("\ntail : "+tail.data);
		System.out.print("List : [");
		while(temp!=tail){
			System.out.print(" "+temp.data);
			temp = temp.next;
		};
		System.out.print(" "+tail.data+" ]");
		
		System.out.println("");
	}
	public void deleteFirst() {
		if(tail==null) {
			System.out.println("List Already Empty");
			return;
		}
		else {
			tail.next = tail.next.next;
		}
	}
	public void deleteLast() {
		if(tail==null) {
			System.out.println("List Already Empty");
			return;
		}
		else {
			Node temp = tail;
			while(temp.next!=tail){
				temp = temp.next;
			};
			temp.next=tail.next;
			tail = temp;
		}
	}
	public void deleteAtPosition(int pos) {
		Node temp = tail.next;
		int count = 1;
		do{
			if(count+1==pos) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
			count++;
		}while(temp!=tail.next);
		if(temp==tail.next) {
			System.out.println("Position Out Of Range!!\nNo Node Deleted!");
		}
	}
	
}
