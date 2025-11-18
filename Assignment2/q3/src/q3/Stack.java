package q3;

public class Stack {
	List l = new List();
	
	public void push(int d) {
		l.addFirst(d);
	}
	public int pop() {
		return l.deleteFirst();
	}
	public int peek() {
		return l.getFirst();
	}
	public void visualize() {
		System.out.print("Stack ");
		l.display();
	}
}
