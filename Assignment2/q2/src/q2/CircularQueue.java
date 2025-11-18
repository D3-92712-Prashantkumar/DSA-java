package q2;

public class CircularQueue {
	int arr[];
	final int SIZE;
	int front,rear,rcounter,fcounter;
	public CircularQueue(int s) {
		SIZE = s;
		arr = new int[SIZE];
		front = rear = -1;
		rcounter=0;
		fcounter=0;
	}
	
	public boolean isFull() {
		return front==-1 && rear==SIZE-1 || front==rear&&rear!=-1;
	}
	public boolean isEmpty() {
		return front==rear && rear==-1;
	}
	public void push(int d) {
		
		if(isFull()) {
			System.out.println("Queue Full!! Data Not Added");
			return;
		}
		rear++;
		if(rear==SIZE) {
			rear=0;
		}
		arr[rear]=d;
	}
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Queue Empty!! Data Not Popped");
			return -1;
		}
		int temp = arr[front+1];
		front++;
		if(front==SIZE) {
			front=0;
		}
		if(front==rear) {
			front=rear=-1;
		}
		System.out.println("Popped : "+ temp);
		return temp;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue Empty!!");
			return -1;
		}
		System.out.println("Peek : "+ arr[front+1]);
		return arr[front+1];
	}
	
	public void display() {
		System.out.print("Circular Queue : [");
		for(int i:arr) {
			System.out.print(" "+i);
		}
		System.out.println(" ]");
	}
}
