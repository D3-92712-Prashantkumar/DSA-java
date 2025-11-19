package q6;

public class List {
	Node head;
	class Node{
		Employee data;
		Node next;
		public Node(Employee e) {
			data = e;
			next = null;
		}
	}
	public List() {
		head=null;
	}
	
	public void addFirst(Employee e) {
		Node nnode = new Node(e);
		nnode.next = head;
		head=nnode;
	}
	public void deleteFirst() {
		if(head==null) {
			System.out.println("already Empty!!");
			return;
		}
		else {
//			int temp = head.data;
			head = head.next;
//			return temp;
		}
	}
	public void addLast(Employee d) {
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
	public void addAtPosition(int pos,Employee d) {
		if(head==null) {
			addFirst(d);
			return;
		}
		Node trav=head;
		for(int i=1;i<pos-1;i++)
			trav=trav.next;
		Node nnode = new Node(d);
		nnode.next=trav.next;
		trav.next = nnode;
	}
	public void deleteLast() {
		if(head==null) {
			System.out.println("already Empty!!");
			return;
		}
		else {
			Node trav = head;
			while(trav.next.next!=null) {
				trav=trav.next;
			}
//			int temp = trav.next.data;
			trav.next=null;
//			return temp;
		}
	}
	public void deleteFromPosition(int pos) {
		if(head==null)
			return;
		Node trav=head;
		for(int i=1;i<pos-1;i++)
			trav=trav.next;
		trav.next = trav.next.next;
	}
	public void deleteById(int id) {
		Node trav = head;
		while(trav.next!=null) {
			if(trav.next.data.getId()==id) {
				System.out.println("Employee Found!!");
				break;
			}
			trav=trav.next;
		}
		if(trav.next==null) {
			System.out.println("Employee Already Not in The List!!");
			return;
		}
		else {
			trav.next=trav.next.next;
			System.out.println("Employee Deleted!!");
		}
	}
	public boolean updateSal(int id,double sal) {
		Node trav = head;
		while(trav!=null) {
			if(trav.data.getId()==id) {
				System.out.println("Employee Found!!");
//				System.out.println(trav.data.toString());
				break;
			}
			trav=trav.next;
		}
		if(trav==null) {
			System.out.println("Employee Not In the List!!");
			return false;
		}
		else {
			trav.data.setSal(sal);
			System.out.println("Update Employee Done!!");
			return true;
		}
	}
	public Employee findByName(String name) {
//		System.out.println("Employee List ==>");
		Node trav = head;
		while(trav!=null) {
			if(trav.data.getName().equals(name)) {
				System.out.println("Employee Found!!");
//				System.out.println(trav.data.toString());
				Employee e = trav.data;
				return e;
			}
//			System.out.println(trav.data.getName());
			trav=trav.next;
		}
		System.out.println("Employee Not In the List!!");
		Employee e1 = new Employee();
		return e1;
	}
	public void display() {
		if(head==null)
			return;
		System.out.println("Employee List ==>");
		Node trav = head;
		while(trav!=null) {
			System.out.println(" "+trav.data.toString());
			trav=trav.next;
		}
		System.out.println("");
	}
}

