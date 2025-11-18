package q3;

public class Queue {
	List l = new List();
	public void push(int d) {
		l.addLast(d);
	}
	public int pop() {
		return l.deleteFirst();
	}
	public int peek() {
		return l.getFirst();
	}
	public void visualize() {
		System.out.print("Queue ");
		l.display();
	}
}
