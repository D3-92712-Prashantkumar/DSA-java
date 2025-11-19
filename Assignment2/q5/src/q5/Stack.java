package q5;

public class Stack {
	int arr[];
	int top;
	final int SIZE;
	public Stack(int s) {
		SIZE = s;
		arr= new int[SIZE];
		top = SIZE;
		System.out.println("Stack Initialized with top = SIZE("+s+").");
	}
	public void push(int d) {
		
		if(top==0) {
			System.out.println("Stack OverFlow!!"
					+ "\nData not Added!!\n");
			return;
		}
		top--;
		arr[top]=d;
	}
	public int pop() {
		if(top==SIZE) {
			System.out.println("Stack UnderFlow!!"
					+ "\nNo Data to Remove!!\n");
			return -1;
		}
		else {
			return arr[top++];
		}
	}
	public int peek() {
		if(top==SIZE) {
			System.out.println("Stack UnderFlow!!"
					+ "\nNo Data to Display!!\n");
			return -1;
		}
		else {
			return arr[top];
		}
	}
}

