package q3;

public class Program {

	public static void main(String[] args) {
		CircularList c = new CircularList();
		
		c.addLast(5);
		c.display();
		c.addFirst(4);
		c.display();
		c.addFirst(3);
		c.display();
		c.addFirst(2);
		c.display();
		c.addFirst(1);
		c.display();
		c.addFirst(0);
		
		c.display();
		c.addLast(6);
		c.display();
		c.addFirst(0);
		c.display();
	}

}
