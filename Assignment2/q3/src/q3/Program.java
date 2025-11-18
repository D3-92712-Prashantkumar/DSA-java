package q3;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	public static int outerMenu() {
		System.out.print("-----------------------\n"
				+ "0) Exit\n"
				+ "1) Stack\n"
				+ "2) Queue\n"
				+ "   Enter Your Choic: ");
		return sc.nextInt();
	}
	public static int innerMenu() {
		System.out.print("-----------------------\n"
				+ "0) Back\n"
				+ "1) Push\n"
				+ "2) Pop\n"
				+ "3) Peek\n"
				+ "4) Visualize\n"
				+ "   Enter Your Choic: ");
		return sc.nextInt();
		
	}
	
	public static void main(String[] args) {
		Stack s = new Stack();
		Queue q = new Queue();
		
		int choice1 =0,choice2=0;
		
		while((choice1=outerMenu())!=0) {
			switch (choice1) {
			case 1:
				while((choice2=innerMenu())!=0) {
					switch (choice2) {
					case 1:
						System.out.print("Enter Data: ");
						s.push(sc.nextInt());
						break;
					case 2:
						System.out.print("Popped : "+s.pop());
//						s.pop();
						break;
					case 3:
						System.out.print("Top    : "+s.peek());
//						s.peek();
						break;
					case 4:
//						System.out.print("Enter Data: ");
						s.visualize();
						break;
					}
				}
				break;
			case 2:
				while((choice2=innerMenu())!=0)
				switch (choice2) {
				case 1:
					System.out.print("Enter Data: ");
					q.push(sc.nextInt());
					break;
				case 2:
					System.out.print("Popped : "+q.pop());
//					s.pop();
					break;
				case 3:
					System.out.print("Top    : "+q.peek());
//					s.peek();
					break;
				case 4:
//					System.out.print("Enter Data: ");
					q.visualize();
					break;
				}
			default:
				break;
			}
		}
		
	}

}
