package q1;

public class Stack {
	int arr[];
	int top;
	final int SIZE;
	public Stack(int s) {
		SIZE = s;
		arr= new int[SIZE];
		top = -1;
	}
	public void push(int d) {
		
		if(top==SIZE-1) {
			System.out.println("Stack OverFlow!!"
					+ "\nData not Added!!\n");
			return;
		}
		top++;
		arr[top]=d;
	}
	public int pop() {
		if(top==-1) {
			System.out.println("Stack UnderFlow!!"
					+ "\nNo Data to Display!!\n");
			return -1;
		}
		else {
			return arr[top--];
		}
	}
	public int peek() {
		if(top==-1) {
			System.out.println("Stack UnderFlow!!"
					+ "\nNo Data to Display!!\n");
			return -1;
		}
		else {
			return arr[top];
		}
	}
}
