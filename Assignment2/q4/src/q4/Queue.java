package q4;
//Linear Queue
public class Queue {
	int arr[];
	final int SIZE;
	int front,rear;
	public Queue(int d) {
		SIZE  = d;
		arr   = new int[SIZE];
		front = 0;
		rear  = 0;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	public boolean isFull() {
		return rear+1==SIZE;
	}
	public void push(int d) {
		if(!isFull()) {
//			rear++;
			arr[rear++]=d;
		}
		else
			System.out.println("Queue already full!!");
	}
	public int pop() {
		if(isEmpty()) {
			return -1;
		}else {
			return arr[front++];
		}
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}else {
			return arr[front];
		}		
	}
}
