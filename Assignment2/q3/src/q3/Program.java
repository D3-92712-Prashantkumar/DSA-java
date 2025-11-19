package q3;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	
	public static int outerMenu() {
		System.out.print("---------------------------------------\n"
				+ "0) Exit\n"
				+ "1) Stack\n"
				+ "2) Queue\n"
				+ "   Enter Your Choic: ");
		return sc.nextInt();
	}
	public static int innerMenu() {
		System.out.print("---------------------------------------\n"
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
					System.out.println("---------------------------------------");
					switch (choice2) {
					case 1:
						System.out.print("Enter Data: ");
						s.push(sc.nextInt());
						break;
					case 2:
						int pop = s.pop();
						if(pop>0)
							System.out.println("Popped : "+pop);
						else
							System.out.println("Nothing to pop :)");
						break;
					case 3:
						int peek = s.peek();
						if(peek>0)
							System.out.println("Top    : "+peek);
						else
							System.out.println("Dont Peek!!! Stack is Already suffering from emptyness :)");
						break;
					case 4:
//						System.out.print("Enter Data: ");
						s.visualize();
						break;
					default:
						System.out.println("Wrong Inner S choice");
						break;
					}
				}
				break;
			case 2:
				int choice3 =0;
				while((choice3=innerMenu())!=0) {
					System.out.println("---------------------------------------");
					switch (choice3) {
					case 1:
						System.out.print("Enter Data: ");
						q.push(sc.nextInt());
						break;
					case 2:
						int pop = q.pop();
						if(pop>0)
							System.out.println("Popped : "+pop);
						else
							System.out.println("Nothing to pop Here :)");
						break;
					case 3:
						int peek = q.peek();
						if(peek>0)
							System.out.println("Front : "+peek);
						else
							System.out.println("Dont Peek!!! Queue is Already suffering from emptyness :)");
						break;
					case 4:
						q.visualize();
						break;
					default:
						System.out.println("Wrong Inner Q choice");
						break;
					}
				}
			default:
				System.out.println("Wrong outer choice");
				break;
			}
		}
		
	}

}
